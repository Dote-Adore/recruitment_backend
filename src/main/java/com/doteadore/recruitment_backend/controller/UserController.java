package com.doteadore.recruitment_backend.controller;


import com.alibaba.fastjson.JSON;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Useraccont;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Userdetailinfo;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.IErrorCode;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.ResumeService;
import com.doteadore.recruitment_backend.service.UserService;
import org.jooq.tools.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("myResume")
    protected R getMyResume(@RequestBody Resume conditions)
    {
        return success(resumeService.GetResumes(conditions));
    }

}
