/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.daos;


import com.doteadore.recruitment_backend.codegen.tables.Companyaccount;
import com.doteadore.recruitment_backend.codegen.tables.records.CompanyaccountRecord;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class CompanyaccountDao extends DAOImpl<CompanyaccountRecord, com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount, String> {

    /**
     * Create a new CompanyaccountDao without any configuration
     */
    public CompanyaccountDao() {
        super(Companyaccount.COMPANYACCOUNT, com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount.class);
    }

    /**
     * Create a new CompanyaccountDao with an attached configuration
     */
    @Autowired
    public CompanyaccountDao(Configuration configuration) {
        super(Companyaccount.COMPANYACCOUNT, com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount.class, configuration);
    }

    @Override
    public String getId(com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount object) {
        return object.getAccount();
    }

    /**
     * Fetch records that have <code>account BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfAccount(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.ACCOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>account IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByAccount(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.ACCOUNT, values);
    }

    /**
     * Fetch a unique record that has <code>account = value</code>
     */
    public com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount fetchOneByAccount(String value) {
        return fetchOne(Companyaccount.COMPANYACCOUNT.ACCOUNT, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByName(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.NAME, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByPassword(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>url BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfUrl(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.URL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByUrl(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.URL, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByDescription(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>tele BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfTele(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.TELE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tele IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByTele(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.TELE, values);
    }

    /**
     * Fetch records that have <code>avatarUrl BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchRangeOfAvatarurl(String lowerInclusive, String upperInclusive) {
        return fetchRange(Companyaccount.COMPANYACCOUNT.AVATARURL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>avatarUrl IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount> fetchByAvatarurl(String... values) {
        return fetch(Companyaccount.COMPANYACCOUNT.AVATARURL, values);
    }
}
