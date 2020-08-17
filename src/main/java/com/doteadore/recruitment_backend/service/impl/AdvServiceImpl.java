package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Homepush;
import com.doteadore.recruitment_backend.codegen.tables.daos.HomepushDao;
import com.doteadore.recruitment_backend.codegen.tables.daos.HomepushapplicationDao;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Homepushapplication;
import com.doteadore.recruitment_backend.service.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service("AdvService")
public class AdvServiceImpl implements AdvService {
    @Autowired
    HomepushapplicationDao homepushapplicationDao;
    @Autowired
    HomepushDao homepushDao;
    @Override
    public boolean pushHomeAdv(Homepushapplication val) {
        try {
            Homepush homepush = new Homepush();
            homepush.setEndtime(val.getEndtime());
            homepush.setJoboffer(val.getJobofferid());
            homepush.setHandleadminid(val.getHandleadminid());
            homepush.setPriority(0);
            homepushDao.insert(homepush);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;

    }

    @Override
    public boolean refuseHomePushApplication(Homepushapplication val) {
        val.setHandletime(LocalDateTime.now());
        val.setHasreadbycompany(0);
        try {
            homepushapplicationDao.update(val);

        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Homepushapplication> getUnhandedHomePushApplication() {
        return homepushapplicationDao.fetchByHandleadminid("");
    }

    @Override
    public boolean applicateHomeAdv(Homepushapplication val) {
        try {
            val.setId(null);
            homepushapplicationDao.insert(val);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Homepushapplication> getCompAdvApplication(String account) {
        return homepushapplicationDao.fetchByCompanyid(account);
    }
}
