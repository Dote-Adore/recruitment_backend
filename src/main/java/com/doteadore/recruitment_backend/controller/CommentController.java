package com.doteadore.recruitment_backend.controller;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Comment;
import com.doteadore.recruitment_backend.common.mybatisplus.ApiController;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comment")
public class CommentController extends ApiController {
    @Autowired
    CommentService commentService;
    @PostMapping("addComment")
    protected R addComment(@RequestBody Comment comment, @RequestParam("targetAccount") String targetAccount)
    {
        return success(commentService.addAComment(comment,targetAccount));
    }
    @GetMapping("getallByJob")
    protected R getAllByJobOffer(int jobid)
    {
        return success(commentService.getAllByJobOffer(jobid));
    }
    @PostMapping
    protected R deleteById(int id)
    {
        return success(commentService.deleteByid(id));
    }
}
