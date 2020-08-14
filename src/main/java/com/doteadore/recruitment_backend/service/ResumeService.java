package com.doteadore.recruitment_backend.service;

import com.alibaba.fastjson.JSONArray;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;
import com.doteadore.recruitment_backend.common.mybatisplus.R;
import org.jooq.Result;

import java.util.List;

public interface ResumeService {
    public JSONArray GetResumesDetail(Resume val);
    public List<Resume> GetResumes(Resume val);
    public boolean addAResume(Resume val);
    public boolean setResumeState(int resumeId, int state);
}
