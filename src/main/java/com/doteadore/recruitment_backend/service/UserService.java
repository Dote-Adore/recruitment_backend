package com.doteadore.recruitment_backend.service;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Useraccont;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Userdetailinfo;
import org.springframework.stereotype.Service;

public interface UserService {
    Useraccont getUser(String accountID);
    Userdetailinfo getUserDetailsInfo(String accountID);
    boolean registerAUser(Useraccont useraccont);
    Useraccont login(String id,String pwd);
    boolean delete(String id);
    boolean editDetailsInfo(Userdetailinfo info);

}
