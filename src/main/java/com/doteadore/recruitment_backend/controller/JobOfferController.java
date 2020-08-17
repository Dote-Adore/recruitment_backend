package com.doteadore.recruitment_backend.controller;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Joboffer;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.JobOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jobOffer")
public class JobOfferController extends ApiController {
    @Autowired
    JobOfferService jobOfferService;
    @GetMapping("all")
    protected R getAllJobOffer(@RequestParam("page")int page,@RequestParam("pageSize") int pageSize) {
        return success(jobOfferService.getJobOffer(new Joboffer(),page,pageSize));
    }

    @PostMapping("conditions")
    protected R getByConditions(@RequestBody Joboffer conditions,@RequestParam("page")int page,@RequestParam("pageSize")int pageSize)
    {
        return success(jobOfferService.getJobOffer(conditions,page,pageSize));
    }
}
