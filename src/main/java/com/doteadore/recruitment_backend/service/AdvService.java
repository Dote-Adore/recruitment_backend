package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Homepushapplication;

import java.util.List;

public interface AdvService {
    boolean pushHomeAdv(Homepushapplication val);
    boolean refuseHomePushApplication(Homepushapplication val);
    List<Homepushapplication> getUnhandedHomePushApplication();
    boolean applicateHomeAdv(Homepushapplication val);
    List<Homepushapplication> getCompAdvApplication(String account);
}
