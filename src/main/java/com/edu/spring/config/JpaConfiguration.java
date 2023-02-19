package com.edu.spring.config;

import com.edu.spring.config.condition.JpaCondition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Slf4j
@Conditional(JpaCondition.class)
@Configuration
public class JpaConfiguration {

//    @Bean
//    @ConfigurationProperties(prefix = "db")
//    public DataBaseProperties dataBaseProperties() {
//        return new DataBaseProperties();
//    }

    @PostConstruct
    void init() {

        log.info("JPA Configuration is enable");
    }
}
