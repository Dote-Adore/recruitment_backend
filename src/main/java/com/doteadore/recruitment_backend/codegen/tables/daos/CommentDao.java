/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.daos;


import com.doteadore.recruitment_backend.codegen.tables.Comment;
import com.doteadore.recruitment_backend.codegen.tables.records.CommentRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentDao extends DAOImpl<CommentRecord, com.doteadore.recruitment_backend.codegen.tables.pojos.Comment, Integer> {

    /**
     * Create a new CommentDao without any configuration
     */
    public CommentDao() {
        super(Comment.COMMENT, com.doteadore.recruitment_backend.codegen.tables.pojos.Comment.class);
    }

    /**
     * Create a new CommentDao with an attached configuration
     */
    public CommentDao(Configuration configuration) {
        super(Comment.COMMENT, com.doteadore.recruitment_backend.codegen.tables.pojos.Comment.class, configuration);
    }

    @Override
    public Integer getId(com.doteadore.recruitment_backend.codegen.tables.pojos.Comment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchById(Integer... values) {
        return fetch(Comment.COMMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.doteadore.recruitment_backend.codegen.tables.pojos.Comment fetchOneById(Integer value) {
        return fetchOne(Comment.COMMENT.ID, value);
    }

    /**
     * Fetch records that have <code>jobOfferId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfJobofferid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.JOBOFFERID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>jobOfferId IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchByJobofferid(Integer... values) {
        return fetch(Comment.COMMENT.JOBOFFERID, values);
    }

    /**
     * Fetch records that have <code>accpuntType BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfAccpunttype(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.ACCPUNTTYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>accpuntType IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchByAccpunttype(Integer... values) {
        return fetch(Comment.COMMENT.ACCPUNTTYPE, values);
    }

    /**
     * Fetch records that have <code>accountId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfAccountid(String lowerInclusive, String upperInclusive) {
        return fetchRange(Comment.COMMENT.ACCOUNTID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>accountId IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchByAccountid(String... values) {
        return fetch(Comment.COMMENT.ACCOUNTID, values);
    }

    /**
     * Fetch records that have <code>responseId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfResponseid(String lowerInclusive, String upperInclusive) {
        return fetchRange(Comment.COMMENT.RESPONSEID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>responseId IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchByResponseid(String... values) {
        return fetch(Comment.COMMENT.RESPONSEID, values);
    }

    /**
     * Fetch records that have <code>time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Comment.COMMENT.TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>time IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchByTime(LocalDateTime... values) {
        return fetch(Comment.COMMENT.TIME, values);
    }

    /**
     * Fetch records that have <code>content BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchRangeOfContent(String lowerInclusive, String upperInclusive) {
        return fetchRange(Comment.COMMENT.CONTENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Comment> fetchByContent(String... values) {
        return fetch(Comment.COMMENT.CONTENT, values);
    }
}
