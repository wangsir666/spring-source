package com.demo.config;


import com.demo.condition.ApplicationInfo;
import com.demo.entity.UserEntity;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ApplicationInfo.class)
public class MyUserConfig {

    @Bean
    public UserEntity getUser(){
        UserEntity user = new UserEntity();
        user.setName("spring");
        return user;
    }
}
