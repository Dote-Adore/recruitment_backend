package com.doteadore.recruitment_backend;

import com.doteadore.recruitment_backend.codegen.tables.pojos.Companyaccount;
import com.doteadore.recruitment_backend.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class CompanyTest {
    @Autowired
    CompanyService companyService;

    @Test
    public void login()
    {
        Companyaccount companyaccount = companyService.Login("mihoyo","123123");

    }
}
