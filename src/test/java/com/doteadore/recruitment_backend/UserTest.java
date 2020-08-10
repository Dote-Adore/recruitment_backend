package com.doteadore.recruitment_backend;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Resume;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Userdetailinfo;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Useraccont;
import com.doteadore.recruitment_backend.service.UserService;
import org.apache.juli.logging.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    void Login()
    {
        Useraccont res =  userService.login("1379382440","431123");
        if(res==null)
            System.out.println("No account");
        System.out.println(res);
    }
    @Test
    void Register()
    {
        Useraccont newUser = new Useraccont("1379382440","宠与崇","123456",null);
        userService.registerAUser(newUser);
    }

    @Test
    void deleteUser()
    {
        userService.delete("1379382440");
    }

    @Test
    void editDetails()
    {
        Userdetailinfo userdetailinfo = new Userdetailinfo();
        userdetailinfo.setAccount("1379382440");
        userdetailinfo.setCity("SZ");
        userdetailinfo.setEducation("本科");
        userService.editDetailsInfo(userdetailinfo);
    }

    @Test
    void GetResumes()
    {
        Resume resume = new Resume();
        resume.setName("测试库");
    }
}
