package com.demo.entity;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @auther: wjx
 * @Date: 2021/1/7 16:48
 * @Description:
 */
@Data
public class UserEntityFactory implements ApplicationContextAware, BeanNameAware, FactoryBean<UserEntity> {

    private String name;

    private String beanName;

    private ApplicationContext applicationContext;

    private UserEntity user = new UserEntity();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName=beanName;
    }

    public String getBeanNameName() {
        return beanName;
    }

    @Override
    public UserEntity getObject() throws Exception {
//        UserEntity user = new UserEntity();
        user.setName("userFacotyCreate");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return UserEntity.class;
    }
}
