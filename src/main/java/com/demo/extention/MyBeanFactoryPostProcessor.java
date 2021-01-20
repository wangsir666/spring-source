package com.demo.extention;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @auther: wjx
 * @Date: 2021/1/8 17:20
 * @Description:
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered , BeanPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor......");
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
