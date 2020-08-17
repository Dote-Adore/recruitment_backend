package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Comment;

import java.util.List;

public interface CommentService {
    Boolean addAComment(Comment val,String targetAccount);
    List<Comment>getAllByJobOffer(int jobId);
    Boolean deleteByid(int id);
}
