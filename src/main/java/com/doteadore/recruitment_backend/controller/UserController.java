package com.doteadore.recruitment_backend.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Useraccont;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Userdetailinfo;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.IErrorCode;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.ResumeService;
import com.doteadore.recruitment_backend.service.UserService;
import org.jooq.JSONFormat;
import org.jooq.tools.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("user")
public class UserController extends ApiController {

    @Autowired
    UserService userService;

    @Autowired
    ResumeService resumeService;

    @PostMapping("login")
    protected R login(@RequestParam("userAccount")String id,
                   @RequestParam("psw")String psw) {
        JSONObject jsonObject = new JSONObject();
        Useraccont res = userService.login(id,psw);
        if (res!=null) {
            Userdetailinfo userdetailinfo = userService.getUserDetailsInfo(id);
            jsonObject.put("user",res);
            jsonObject.put("details",userdetailinfo);
            return success(jsonObject);
        }
        else
            return success(false);
    }

    @PostMapping("register")
    protected R Register(@RequestParam Useraccont useraccont)
    {
        if(userService.registerAUser(useraccont)==true)
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

    @PostMapping("editDetail")
    protected R editDetails(@RequestBody Userdetailinfo userdetailinfo)
    {
        return success(userService.editDetailsInfo(userdetailinfo));
    }
    // 获取用户信息，包括详情
    @GetMapping("getUserInfo")
    protected R getUserInfo(@RequestParam("accountID") String AccountID)
    {
     Userdetailinfo userdetailinfo =  userService.getUserDetailsInfo(AccountID);
     Useraccont useraccont = userService.getUser(AccountID);
        com.alibaba.fastjson.JSONObject jsonObject = new com.alibaba.fastjson.JSONObject();
        jsonObject.put("account",useraccont);
        jsonObject.put("details",userdetailinfo);
        return success(jsonObject);
    }
    @GetMapping("myResume")
    protected R getMyResume(@RequestParam String accountID) {
        Resume conditions = new Resume();
        conditions.setUserid(accountID);

        return  success(resumeService.GetResumesDetail(conditions));
    }
    @PostMapping("sendResume")
    protected R setMyResume(@RequestBody Resume resume)
    {
        // 默认设置一些东西
        // 没有通过
        resume.setIspassed(0);
        // 当前的状态为初筛
        resume.setState(1);
        resume.setPosttime(LocalDateTime.now());
        resume.setStatetime(LocalDateTime.now());
        return success(resumeService.addAResume(resume));
    }

}
