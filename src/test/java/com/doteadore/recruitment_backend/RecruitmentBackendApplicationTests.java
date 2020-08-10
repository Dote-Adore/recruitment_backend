package com.doteadore.recruitment_backend;

import com.doteadore.recruitment_backend.codegen.tables.Education;
import com.doteadore.recruitment_backend.codegen.tables.Resumestate;
import com.doteadore.recruitment_backend.codegen.tables.daos.UseraccontDao;
import com.doteadore.recruitment_backend.codegen.tables.pojos.Useraccont;
import com.doteadore.recruitment_backend.service.UserService;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Result;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.TransactionManager;

@SpringBootTest
class RecruitmentBackendApplicationTests {
    @Autowired
    DSLContext dslContext;
    @Autowired
    Configuration configuration;
    @Autowired
    TransactionManager transactionManager;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        Result result = dslContext.select(Resumestate.RESUMESTATE.KEY.as("id"),Resumestate.RESUMESTATE.VALUE.as("简历状态"),Education.EDUCATION.VALUE.as("学历"))
        .from(Resumestate.RESUMESTATE)
                .leftJoin(Education.EDUCATION).on(Resumestate.RESUMESTATE.KEY.eq(Education.EDUCATION.KEY))
                .fetch();
        System.out.println(result);
        //这里是表头名称
        System.out.println(result.formatJSON());
        Resumestate rs;
    }
    @Autowired
    UseraccontDao dao;

    @Test
    void RegisterTest()
    {
        String account ="1234";
        String name = "452";
        String psw = "789";
        Useraccont ua = new Useraccont();
        ua.setAccount(account);
        ua.setNickname(name);
        ua.setPassword(psw);
        // 插入
        try {
            dao.insert(ua);
        }catch (DuplicateKeyException exception)
        {
            System.out.println(exception);
        }

    }
    @Test
    void findUserAccount()
    {
        System.out.println(dao.findById("12333"));
    }
    @Autowired
    @Test
    void registerService()
    {
        Useraccont useraccont = new Useraccont();
        useraccont.setAccount("123323323");
        useraccont.setNickname("cyc");
        useraccont.setPassword("1234");
        // 注册成功
       // if(register.RegisterNormal(useraccont))
      //  {
      //      System.out.println("注册成功!");
      //  }
      //  else
      //  {
      //      System.out.println("账号已经存在!");
      //  }
    }

}
