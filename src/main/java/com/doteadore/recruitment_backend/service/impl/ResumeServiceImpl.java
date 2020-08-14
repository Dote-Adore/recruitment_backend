package com.doteadore.recruitment_backend.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.doteadore.recruitment_backend.codegen.tables.Companyaccount;
import com.doteadore.recruitment_backend.codegen.tables.Joboffer;
import com.doteadore.recruitment_backend.codegen.tables.Resumestate;
import com.doteadore.recruitment_backend.codegen.tables.daos.ResumeDao;
import com.doteadore.recruitment_backend.codegen.tables.Resume;
import com.doteadore.recruitment_backend.codegen.tables.records.ResumeRecord;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import com.doteadore.recruitment_backend.service.ResumeService;
import com.sun.net.httpserver.Authenticator;
import lombok.extern.slf4j.Slf4j;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.meta.jaxb.Generate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("ResumeService")
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    ResumeDao resumeDao;
    @Autowired
    DSLContext dslContext;


    @Override
    public JSONArray GetResumesDetail(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume val) {
        Result res = dslContext.select(
                Resume.RESUME.ID,Resume.RESUME.JOBID,Resume.RESUME.EDUCATION,Resume.RESUME.ISPASSED,Resume.RESUME.POSTTIME,Resume.RESUME.STATETIME,
                Joboffer.JOBOFFER.TITLE.as("JobOfferTitle"), Companyaccount.COMPANYACCOUNT.NAME.as("CompanyName"),
                Companyaccount.COMPANYACCOUNT.AVATARURL.as("CompAvatar"), Resumestate.RESUMESTATE.VALUE.as("stateName"))
                .from(Resume.RESUME)
                .innerJoin(Joboffer.JOBOFFER).on(Resume.RESUME.JOBID.eq(Joboffer.JOBOFFER.ID).and(generateConditions(val)))
                .innerJoin(Companyaccount.COMPANYACCOUNT).on(Joboffer.JOBOFFER.COMPANY.eq(Companyaccount.COMPANYACCOUNT.ACCOUNT))
                .innerJoin(Resumestate.RESUMESTATE).on(Resumestate.RESUMESTATE.KEY.eq(Resume.RESUME.STATE)).fetch();
        JSONFormat jsonFormat = new JSONFormat().header(false).recordFormat(JSONFormat.RecordFormat.OBJECT);
        String resJson = res.formatJSON(jsonFormat);
        return  JSONArray.parseArray(resJson);
    }

    @Override
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Resume>
    GetResumes(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume val) {

        SelectWhereStep<ResumeRecord> records = dslContext.selectFrom(Resume.RESUME);
        ResumeRecord resumeRecord = dslContext.newRecord(Resume.RESUME);
        resumeRecord.from(val);
        Condition condition = generateConditions(val);
        Result res = records.where(condition).fetch();
        log.info("target condition: "+condition.toString());
        return res.into(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume.class);
    }

    @Override
    public boolean addAResume(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume val) {
        try {
            resumeDao.insert(val);
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean setResumeState(int resumeId, int state) {
        return false;
    }


    private Condition generateConditions(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume  val)
    {
// 生成条件语句
        Condition condition  = DSL.trueCondition();
        if (val.getId()!=null)
            condition = condition.and(Resume.RESUME.ID.eq(val.getId()));
        if(val.getAttatchmenturl()!=null)
            condition = condition.and(Resume.RESUME.ATTATCHMENTURL.eq(val.getAttatchmenturl()));
        if(val.getUserid()!=null)
            condition = condition.and(Resume.RESUME.USERID.eq(val.getUserid()));
        if(val.getJobid()!=null)
            condition = condition.and(Resume.RESUME.JOBID.eq(val.getJobid()));
        if(val.getCity()!=null)
            condition = condition.and(Resume.RESUME.CITY.eq(val.getCity()));
        if(val.getEducation()!=null)
            condition = condition.and(Resume.RESUME.EDUCATION.eq(val.getEducation()));
        if(val.getEmail()!=null)
            condition = condition.and(Resume.RESUME.EMAIL.eq(val.getEmail()));
        if(val.getGraduationyear()!=null)
            condition = condition.and(Resume.RESUME.GRADUATIONYEAR.eq(val.getGraduationyear()));
        if(val.getState()!=null)
            condition = condition.and(Resume.RESUME.STATE.eq(val.getState()));
        if(val.getName()!=null)
            condition = condition.and(Resume.RESUME.NAME.eq(val.getName()));
        if(val.getSex()!=null)
            condition = condition.and(Resume.RESUME.SEX.eq(val.getSex()));
        if(val.getIspassed()!=null)
            condition = condition.and(Resume.RESUME.ISPASSED.eq(val.getIspassed()));
        if(val.getCompanyid()!=null)
            condition = condition.and(Resume.RESUME.COMPANYID.eq(val.getCompanyid()));
        return condition;
    }
}
