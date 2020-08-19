package com.doteadore.recruitment_backend.controller;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Homepushapplication;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.AdminService;
import com.doteadore.recruitment_backend.service.AdvService;
import com.doteadore.recruitment_backend.service.JobOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// 管理员
@RestController
@RequestMapping("admin")
public class AdminController  extends ApiController {
    @Autowired
    AdminService adminService;
    @Autowired
    AdvService advService;
    @Autowired
    JobOfferService jobOfferService;
    // 注册
    @PostMapping("register")
    protected R register(@RequestBody Adminaccount account)
    {
        return success(adminService.register(account));
    }

    //登录
    @PostMapping("login")
    protected R login(@RequestParam("account")String id,@RequestParam("password")String password )
    {
        return success(adminService.login(id, password));
    }
    //获取没有处理的广告请求
    @GetMapping("adv/application/unhandled")
    protected R getUnhandledApplication()
    {
        return success(advService.getUnhandedHomePushApplication());
    }

    // 推送该请求到首页
    @PostMapping("adv/pushHome")
    protected R pushHomeAdv(@RequestBody Homepushapplication val) {
        return success(advService.applicateHomeAdv(val));
    }

    // 拒绝推送该请求
    @PostMapping("adv/refuse")
    protected R refuseAppli(@RequestBody Homepushapplication homepushapplication)
    {
        return success(advService.refuseHomePushApplication(homepushapplication));
    }

    // 删除一个招聘
    @PostMapping("deleteOffer")
    protected R deleteOffer(@RequestParam("jobOfferid") int id)
    {
        return success(jobOfferService.deleteAJob(id));
    }

}
