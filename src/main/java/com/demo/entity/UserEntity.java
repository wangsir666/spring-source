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
public class UserEntity {

    private String name;

}
