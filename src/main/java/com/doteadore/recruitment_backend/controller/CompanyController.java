package com.doteadore.recruitment_backend.controller;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Homepushapplication;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Joboffer;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.IErrorCode;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.AdvService;
import com.doteadore.recruitment_backend.service.CompanyService;
import com.doteadore.recruitment_backend.service.JobOfferService;
import com.doteadore.recruitment_backend.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("company")
public class CompanyController extends ApiController {
    @Autowired
    CompanyService companyService;
    @Autowired
    ResumeService resumeService;
    @Autowired
    AdvService advService;
    @Autowired
    JobOfferService jobOfferService;
    // 公司注册
    @PostMapping("register")
    R register(@RequestBody Companyaccount companyaccount)
    {

        if(companyService.register(companyaccount)==true)
        {
            return R.restResult(true, new IErrorCode() {
                @Override
                public long getCode() {
                    return 1;
                }

                @Override
                public String getMsg() {
                    return "注册成功！";
                }
            });
        }
        else
        {
            return R.restResult(false, new IErrorCode() {
                @Override
                public long getCode() {
                    return -1;
                }

                @Override
                public String getMsg() {
                    return "注册失败！该用户已被注册！";
                }
            });
        }
    }

    // 登录
    @PostMapping("login")
    R login(@RequestParam("account")String id,@RequestParam("password")String password)
    {
        com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount  res =  companyService.Login(id,password);
        if(res!=null){
            return success(res);
        }
        else return success(false);
    }

    // 获取该公司下所有的简历
    @GetMapping("getAllResumes")
    R getAllResumes(@RequestParam String accountID)
    {

        Resume resume = new Resume();
        resume.setCompanyid(accountID);
        return success(resumeService.GetResumesDetail(resume));
    }
    // 更新状态
    @PostMapping("setResumeState")
    R setAResumeState(@RequestParam("resumeID") int resumeID,@RequestParam("stateidx") int stateidx)
    {
        return success(resumeService.setResumeState(resumeID,stateidx));
    }

    // 申请广告
    @PostMapping("applicateAdv")
    R applicateHomeAdv(@RequestBody Homepushapplication val)
    {
        return success(advService.applicateHomeAdv(val));
    }



    // 获取我的申请
    @PostMapping("getAdvApplication")
    R getMyAdvApplication(@RequestParam("companyAccount") String account)
    {
        return success(advService.getCompAdvApplication(account));
    }
    // 发布招聘
    @PostMapping("postJobOffer")
    R postJobOffer(@RequestBody Joboffer val)
    {
        return success(jobOfferService.addAJob(val));
    }
    // 删除一个招聘
    @PostMapping("deleteJob")
    R deleteAOffer(@RequestParam("jobID") int id)
    {
        return success(jobOfferService.deleteAJob(id));
    }

    // 获得某个公司的信息
    @PostMapping("getInfo")
    R getInfo(@RequestParam("CompanyAccount")String account)
    {
        return success(companyService.getCompInfo(account));
    }
}
