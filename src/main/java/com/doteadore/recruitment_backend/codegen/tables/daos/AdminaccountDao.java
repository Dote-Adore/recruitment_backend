/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.daos;


import com.doteadore.recruitment_backend.codegen.tables.Adminaccount;
import com.doteadore.recruitment_backend.codegen.tables.records.AdminaccountRecord;

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
public class AdminaccountDao extends DAOImpl<AdminaccountRecord, com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount, String> {

    /**
     * Create a new AdminaccountDao without any configuration
     */
    public AdminaccountDao() {
        super(Adminaccount.ADMINACCOUNT, com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount.class);
    }

    /**
     * Create a new AdminaccountDao with an attached configuration
     */
    @Autowired
    public AdminaccountDao(Configuration configuration) {
        super(Adminaccount.ADMINACCOUNT, com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount.class, configuration);
    }

    @Override
    public String getId(com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount object) {
        return object.getAccount();
    }

    /**
     * Fetch records that have <code>account BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount> fetchRangeOfAccount(String lowerInclusive, String upperInclusive) {
        return fetchRange(Adminaccount.ADMINACCOUNT.ACCOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>account IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount> fetchByAccount(String... values) {
        return fetch(Adminaccount.ADMINACCOUNT.ACCOUNT, values);
    }

    /**
     * Fetch a unique record that has <code>account = value</code>
     */
    public com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount fetchOneByAccount(String value) {
        return fetchOne(Adminaccount.ADMINACCOUNT.ACCOUNT, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Adminaccount.ADMINACCOUNT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount> fetchByName(String... values) {
        return fetch(Adminaccount.ADMINACCOUNT.NAME, values);
    }

    /**
     * Fetch records that have <code>password BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount> fetchRangeOfPassword(String lowerInclusive, String upperInclusive) {
        return fetchRange(Adminaccount.ADMINACCOUNT.PASSWORD, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount> fetchByPassword(String... values) {
        return fetch(Adminaccount.ADMINACCOUNT.PASSWORD, values);
    }
}
