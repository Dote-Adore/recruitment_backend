/*
 * This file is generated by jOOQ.
 */
package com.doteadore.recruitment_backend.codegen.tables.daos;


import com.doteadore.recruitment_backend.codegen.tables.Professionposition;
import com.doteadore.recruitment_backend.codegen.tables.records.ProfessionpositionRecord;

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
public class ProfessionpositionDao extends DAOImpl<ProfessionpositionRecord, com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition, Integer> {

    /**
     * Create a new ProfessionpositionDao without any configuration
     */
    public ProfessionpositionDao() {
        super(Professionposition.PROFESSIONPOSITION, com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition.class);
    }

    /**
     * Create a new ProfessionpositionDao with an attached configuration
     */
    @Autowired
    public ProfessionpositionDao(Configuration configuration) {
        super(Professionposition.PROFESSIONPOSITION, com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition.class, configuration);
    }

    @Override
    public Integer getId(com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>key BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition> fetchRangeOfKey(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Professionposition.PROFESSIONPOSITION.KEY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>key IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition> fetchByKey(Integer... values) {
        return fetch(Professionposition.PROFESSIONPOSITION.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>key = value</code>
     */
    public com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition fetchOneByKey(Integer value) {
        return fetchOne(Professionposition.PROFESSIONPOSITION.KEY, value);
    }

    /**
     * Fetch records that have <code>value BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition> fetchRangeOfValue(String lowerInclusive, String upperInclusive) {
        return fetchRange(Professionposition.PROFESSIONPOSITION.VALUE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Professionposition> fetchByValue(String... values) {
        return fetch(Professionposition.PROFESSIONPOSITION.VALUE, values);
    }
}
