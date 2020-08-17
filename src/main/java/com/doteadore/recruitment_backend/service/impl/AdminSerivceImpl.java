package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.AdminaccountDao;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount;
import com.doteadore.recruitment_backend.service.AdminService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("AdminService")
public class AdminSerivceImpl implements AdminService {
    @Autowired
    AdminaccountDao adminaccountDao;
    @Autowired
    DSLContext dslContext;

    @Override
    public Adminaccount getAAdmin(String accountID) {
        Adminaccount res =  adminaccountDao.findById(accountID);
        res.setPassword("");
        return res;
    }

    @Override
    public boolean register(Adminaccount adminaccount) {
        try {
            adminaccountDao.insert(adminaccount);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Adminaccount login(String accountid, String psw) {
        com.doteadore.recruitment_backend.codegen.tables.Adminaccount tempTable = com.doteadore.recruitment_backend.codegen.tables.Adminaccount.ADMINACCOUNT;
        return dslContext.select(tempTable.ACCOUNT,tempTable.NAME).from(tempTable)
                .where(tempTable.ACCOUNT.eq(accountid).and(tempTable.PASSWORD.eq(psw))).fetchOne().into(Adminaccount.class);

    }
}
