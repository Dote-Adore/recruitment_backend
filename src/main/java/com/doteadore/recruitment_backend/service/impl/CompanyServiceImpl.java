package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.CompanyaccountDao;
import com.doteadore.recruitment_backend.codegen.tables.interfaces.ICompanyaccount;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount;
import com.doteadore.recruitment_backend.service.CompanyService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.ExportException;


@Service("CompanyService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyaccountDao companyaccountDao;
    @Autowired
    DSLContext dslContext;
    @Override
    public Companyaccount getCompInfo(String accountID) {
        return companyaccountDao.findById(accountID);
    }

    @Override
    public boolean register(Companyaccount companyaccount) {
        try {
            companyaccountDao.insert(companyaccount);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    @Override
    public Companyaccount Login(String id, String psw) {
        try {

            com.doteadore.recruitment_backend.codegen.tables.Companyaccount companyTable = new com.doteadore.recruitment_backend.codegen.tables.Companyaccount();
            return dslContext.select(companyTable.ACCOUNT, companyTable.NAME, companyTable.AVATARURL, companyTable.TELE, companyTable.URL, companyTable.DESCRIPTION).from(companyTable)
                    .where(companyTable.ACCOUNT.eq(id).and(companyTable.PASSWORD.eq(psw)))
                    .fetchOne().into(Companyaccount.class);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        try {
            companyaccountDao.deleteById(id);
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean editInfo(Companyaccount info) {
        try{
            companyaccountDao.update(info);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
            return true;
    }
}
