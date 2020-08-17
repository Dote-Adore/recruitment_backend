package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.*;

import java.util.List;

public interface UtilService {
    List<Education> getEducationEnum();
    List<Resumestate> getResumeStateEnum();
    List<Professiontype> getProfessionTypeEnum();
    List<Professionposition> GetProfessionPositionEnum();
}
