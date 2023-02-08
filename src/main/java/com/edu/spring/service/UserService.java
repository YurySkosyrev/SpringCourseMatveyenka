package com.edu.spring.service;

import com.edu.spring.database.entity.Company;
import com.edu.spring.database.repository.CrudRepository;
import com.edu.spring.database.repository.UserRepository;
import com.edu.spring.database.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository,
                       CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
