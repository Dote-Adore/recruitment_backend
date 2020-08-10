package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;

import java.util.List;

public interface ResumeService {
    public List<Resume> GetResumes(Resume val);
    boolean addAResume(Resume val);
    boolean setResumeState(int resumeId, int state);
}
