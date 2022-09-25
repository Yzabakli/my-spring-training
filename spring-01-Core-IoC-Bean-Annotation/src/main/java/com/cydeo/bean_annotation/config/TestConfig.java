package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public String getStr(){
        return "";
    }

    @Bean
    public Integer getInteger(){
        return Integer.getInteger("1");
    }
}
