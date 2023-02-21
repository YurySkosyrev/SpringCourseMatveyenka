package com.edu.spring.integration.service;

import com.edu.spring.ApplicationRunner;
import com.edu.spring.database.entity.Company;
import com.edu.spring.dto.CompanyReadDTO;
import com.edu.spring.listner.entity.EntityEvent;
import com.edu.spring.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = ApplicationRunner.class,
//initializers = ConfigDataApplicationContextInitializer.class)

@SpringBootTest
public class CompanyServiceIT {

    private static final Integer COMPANY_ID = 1;

    @Autowired
    private CompanyService companyService;

    @Test
    void findById() {

        var actualResult = companyService.findById(COMPANY_ID);

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDTO(COMPANY_ID);
        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));

    }
}
