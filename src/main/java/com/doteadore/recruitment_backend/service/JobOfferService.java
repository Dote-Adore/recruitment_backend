package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Joboffer;

import java.util.List;

public interface JobOfferService {
    List<Joboffer> getJobOffer(Joboffer conditions,int page, int pageSize);
    boolean deleteAJob(int id);
    boolean addAJob(Joboffer joboffer);
}
