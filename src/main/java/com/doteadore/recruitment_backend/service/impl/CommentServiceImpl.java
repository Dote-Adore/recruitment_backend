package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.CommentDao;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Comment;
import com.doteadore.recruitment_backend.service.CommentService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service("CommentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;
    @Autowired
    DSLContext dslContext;
    @Override
    public Boolean addAComment(Comment val, String targetAccount) {
        val.setTime(LocalDateTime.now());
       try {
           commentDao.insert(val);
       }catch (Exception e)
       {
           e.printStackTrace();
           return false;
       }
       return true;
    }

    @Override
    public List<Comment> getAllByJobOffer(int jobId) {
        return commentDao.fetchByJobofferid(jobId);
    }

    @Override
    public Boolean deleteByid(int id) {
        com.doteadore.recruitment_backend.codegen.tables.Comment tempTable = com.doteadore.recruitment_backend.codegen.tables.Comment.COMMENT;
       dslContext.deleteFrom(tempTable).where(tempTable.RESPONSEID.eq(id).or(tempTable.ID.eq(id)));
    return false;
    }
}
