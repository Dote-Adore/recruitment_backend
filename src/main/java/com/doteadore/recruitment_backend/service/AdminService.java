package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Adminaccount;

public interface AdminService {
    Adminaccount getAAdmin(String accountID);
    boolean register(Adminaccount adminaccount);
    Adminaccount login(String accountid, String psw);
}
