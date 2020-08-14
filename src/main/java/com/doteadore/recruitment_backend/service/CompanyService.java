package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount;
import com.doteadore.recruitment_backend.codegen.tables.daos.CompanyaccountDao;
import org.springframework.beans.factory.annotation.Autowired;

public interface CompanyService {
    Companyaccount getCompInfo(String accountID);
    boolean register(Companyaccount companyaccount);
    Companyaccount Login(String id,String psw);
    boolean delete(String id);
    boolean editInfo(Companyaccount info);
}
