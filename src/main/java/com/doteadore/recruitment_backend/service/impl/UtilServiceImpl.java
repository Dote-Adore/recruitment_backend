package com.doteadore.recruitment_backend.service.impl;

import com.doteadore.recruitment_backend.codegen.tables.daos.*;
import com.doteadore.recruitment_backend.codegen.tables.pojos.*;
import com.doteadore.recruitment_backend.service.UtilService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UtilService")
public class UtilServiceImpl implements UtilService {


    @Autowired
    EducationDao educationDao;
    @Autowired
    ResumestateDao resumestateDao;
    @Autowired
    ProfessiontypeDao professiontypeDao;
    @Autowired
    ProfessionpositionDao professionpositionDao;

    @Override
    public List<Education> getEducationEnum() {
            return educationDao.findAll();
    }

    @Override
    public List<Resumestate> getResumeStateEnum() {
        return resumestateDao.findAll();
    }

    @Override
    public List<Professiontype> getProfessionTypeEnum() {
        return professiontypeDao.findAll();
    }

    @Override
    public List<Professionposition> GetProfessionPositionEnum() {
        return professionpositionDao.findAll();
    }
}
