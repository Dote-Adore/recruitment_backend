package com.doteadore.recruitment_backend.controller;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Comment;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// 评论部分
@RestController
@RequestMapping("comment")
public class CommentController extends ApiController {
    @Autowired
    CommentService commentService;

    // 添加一个评论，注意，后面的RequestParam放在url才可以
    @PostMapping("addComment")
    protected R addComment(@RequestBody Comment comment, @RequestParam("targetAccount") String targetAccount)
    {
        return success(commentService.addAComment(comment,targetAccount));
    }

    // 获得该职业下所有的评论
    @GetMapping("getallByJob")
    protected R getAllByJobOffer(int jobid)
    {
        return success(commentService.getAllByJobOffer(jobid));
    }

    // 删除一个评论
    @PostMapping
    protected R deleteById(int id)
    {
        return success(commentService.deleteByid(id));
    }
}
