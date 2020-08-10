package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.UseraccontDao;
import com.doteadore.recruitment_backend.codegen.tables.daos.UserdetailinfoDao;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Useraccont;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Userdetailinfo;
import com.doteadore.recruitment_backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
@Slf4j
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UseraccontDao useraccontDao;
    @Autowired
    UserdetailinfoDao userdetailinfoDao;
    @Autowired
    DSLContext dslContext;

    @Override
    public Useraccont getUser(String accountID) {
        return useraccontDao.findById(accountID);
    }

    @Override
    public Userdetailinfo getUserDetailsInfo(String accountID) {
        return userdetailinfoDao.findById(accountID);
    }

    @Override
    public boolean registerAUser(Useraccont useraccont) {
        try {
            useraccontDao.insert(useraccont);
            Userdetailinfo info = new Userdetailinfo();
            info.setAccount(useraccont.getAccount());
            userdetailinfoDao.insert(info);
            log.info("Register User \""+ useraccont.getAccount()+"\" Success!");
            return true;
        }catch (DuplicateKeyException e)
        {
            // e.printStackTrace();
            log.info("account:\""+useraccont.getAccount()+"\" has already existed! Register UserAccount Failed!");
            return false;
        }
    }

    @Override
    public Useraccont login(String id, String pwd) {
        Result res = dslContext.select(com.doteadore.recruitment_backend.codegen.tables.Useraccont.USERACCONT.ACCOUNT,
                com.doteadore.recruitment_backend.codegen.tables.Useraccont.USERACCONT.AVATARURL,
                com.doteadore.recruitment_backend.codegen.tables.Useraccont.USERACCONT.NICKNAME)
                .from(com.doteadore.recruitment_backend.codegen.tables.Useraccont.USERACCONT)
                .where(com.doteadore.recruitment_backend.codegen.tables.Useraccont.USERACCONT.ACCOUNT.eq(id).and(com.doteadore.recruitment_backend.codegen.tables.Useraccont.USERACCONT.PASSWORD.eq(pwd)))
                .fetch();

        List<Useraccont> list =  res.into(Useraccont.class);
        if(list.size()>0)
        return list.get(0);
        else
             return null;

    }

    @Override
    public boolean delete(String id) {
        try {
            useraccontDao.deleteById(id);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean editDetailsInfo(Userdetailinfo info) {
        try {
            userdetailinfoDao.update(info);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
