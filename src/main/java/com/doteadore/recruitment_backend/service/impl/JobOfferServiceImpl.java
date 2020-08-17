package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.JobofferDao;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Joboffer;
import com.doteadore.recruitment_backend.codegen.tables.records.JobofferRecord;
import com.doteadore.recruitment_backend.service.JobOfferService;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.jooq.Condition;


@Service("JobOfferService")
public class JobOfferServiceImpl implements JobOfferService {

    @Autowired
    JobofferDao jobofferDao;
    @Autowired
    DSLContext dslContext;
    @Override
    public List<Joboffer> getJobOffer(Joboffer conditions,int page, int pageSize) {
        conditions.setIsdeleted(0);
        Condition condition = generateConditions(conditions);
        com.doteadore.recruitment_backend.codegen.tables.Joboffer tempTable =com.doteadore.recruitment_backend.codegen.tables.Joboffer.JOBOFFER;

        org.jooq.SelectConditionStep<JobofferRecord> query = dslContext.selectFrom(tempTable).where(condition);

        if(pageSize >0)
        {
            query.limit((page-1)* pageSize).offset(pageSize);
        }
        Result record = query.orderBy(tempTable.STARTTIME.desc()).fetch();
        return record.into(Joboffer.class);
    }

    private Condition generateConditions(Joboffer val)
    {
        com.doteadore.recruitment_backend.codegen.tables.Joboffer tempTable = com.doteadore.recruitment_backend.codegen.tables.Joboffer.JOBOFFER;
        Condition condition  = DSL.trueCondition();
        if(val.getId()!=null)
        {
            condition = condition.and(tempTable.ID.eq(val.getId()));
        }
        if(val.getCompany()!=null)
        {
            condition = condition.and(tempTable.COMPANY.eq(val.getCompany()));
        }
        if(val.getProfessiontype()!=null)
        {
            condition = condition.and(tempTable.PROFESSIONTYPE.eq(val.getProfessiontype()));
        }
        if(val.getTitle()!=null)
        {
            condition = condition.and(tempTable.COMPANY.like(val.getTitle()));
        }
        if(val.getDescription()!=null)
        {
            condition = condition.and(tempTable.DESCRIPTION.like(val.getDescription()));
        }
        if(val.getIsdeleted()!=null)
        {
            condition = condition.and(tempTable.ISDELETED.eq(val.getIsdeleted()));
        }
        if(val.getPosition()!=null)
        {
            condition = condition.and(tempTable.POSITION.eq(val.getPosition()));
        }
        return condition;
    }

    @Override
    public boolean deleteAJob(int id) {
        try{
            com.doteadore.recruitment_backend.codegen.tables.Joboffer tempTable = com.doteadore.recruitment_backend.codegen.tables.Joboffer.JOBOFFER;
            // 删除job
            dslContext.update(tempTable).set(tempTable.ISDELETED,1).where(tempTable.ID.eq(id));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean addAJob(Joboffer joboffer) {
        try
        {
            jobofferDao.insert(joboffer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
