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

@RestController
@RequestMapping("admin")
public class AdminController  extends ApiController {
    @Autowired
    AdminService adminService;
    @Autowired
    AdvService advService;
    @Autowired
    JobOfferService jobOfferService;
    @PostMapping("register")
    protected R register(@RequestBody Adminaccount account)
    {
        return success(adminService.register(account));
    }

    @PostMapping("login")
    protected R login(@RequestParam("id")String id,@RequestParam("password")String password )
    {
        return success(adminService.login(id, password));
    }
    @GetMapping("adv/application/unhandled")
    protected R getUnhandledApplication()
    {
        return success(advService.getUnhandedHomePushApplication());
    }
    @PostMapping("adv/pushHome")
    protected R pushHomeAdv(@RequestBody Homepushapplication val) {
        return success(advService.applicateHomeAdv(val));
    }

    @PostMapping("adv/refuse")
    protected R refuseAppli(@RequestBody Homepushapplication homepushapplication)
    {
        return success(advService.refuseHomePushApplication(homepushapplication));
    }
    @PostMapping("deleteOffer")
    protected R deleteOffer(@RequestParam("jobOfferid") int id)
    {
        return success(jobOfferService.deleteAJob(id));
    }

}
