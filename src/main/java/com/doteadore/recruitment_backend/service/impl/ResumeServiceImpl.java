package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.ResumeDao;
import com.doteadore.recruitment_backend.codegen.tables.Resume;
import com.doteadore.recruitment_backend.codegen.tables.records.ResumeRecord;
import com.doteadore.recruitment_backend.service.ResumeService;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ResumeService")
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    ResumeDao resumeDao;
    @Autowired
    DSLContext dslContext;

    @Override
    public List<com.doteadore.recruitment_backend.codegen.tables.pojos.Resume>
    GetResumes(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume val) {

        SelectWhereStep<ResumeRecord> records = dslContext.selectFrom(Resume.RESUME);
        // ResumeRecord resumeRecord = dslContext.newRecord(Resume.RESUME);
        // resumeRecord.from(val);
        Condition condition  = Resume.RESUME.ID.eq(val.getId());
        Result res = records.where(condition).fetch();
        return res.into(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume.class);
    }

    @Override
    public boolean addAResume(com.doteadore.recruitment_backend.codegen.tables.pojos.Resume val) {
        return false;
    }

    @Override
    public boolean setResumeState(int resumeId, int state) {
        return false;
    }
}
