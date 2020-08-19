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

    /**
     * 获取所有的简历
     * @param page 页号
     * @param pageSize 每页的显示的数量
     * @return
     */
    @GetMapping("all")
    protected R getAllJobOffer(@RequestParam("page")int page,@RequestParam("pageSize") int pageSize) {
        return success(jobOfferService.getJobOffer(new Joboffer(),page,pageSize));
    }

    /**
     * 筛选
     * @param conditions 筛选条件
     * @param page 页号，url参数
     * @param pageSize 每页大小，url参数
     * @return
     */
    @PostMapping("conditions")
    protected R getByConditions(@RequestBody Joboffer conditions,@RequestParam("page")int page,@RequestParam("pageSize")int pageSize)
    {
        return success(jobOfferService.getJobOffer(conditions,page,pageSize));
    }
}
