package com.doteadore.recruitment_backend.controller;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Homepushapplication;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Joboffer;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.CompanyService;
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

    // 公司注册
    @PostMapping("register")
    R register(@RequestBody Companyaccount companyaccount)
    {

        return  success(companyService.register(companyaccount));
    }

    // 登录
    @PostMapping("login")
    R login(@RequestParam("id")String id,@RequestParam("password")String password)
    {
        return success(companyService.Login(id,password));
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
        return null;
    }



    // 获取我的申请
    @PostMapping("getAdvApplication")
    R getMyAdvApplication(@RequestParam("companyAccount") String account)
    {
        return null;
    }
    // 发布招聘
    @PostMapping("postJobOffer")
    R postJobOffer(@RequestBody Joboffer val)
    {
        return null;
    }
    // 删除一个招聘
    @PostMapping("deleteJob")
    R deleteAOffer(@RequestParam("jobID") int id)
    {
        return null;
    }

    @PostMapping("getInfo")
    R getInfo(@RequestParam("CompanyAccount")String account)
    {
        return success(companyService.getCompInfo(account));
    }
}
