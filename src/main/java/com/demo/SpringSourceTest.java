package com.demo;

import com.demo.entity.UserEntity;
import com.demo.extention.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX;

/**
 * @auther: wjx
 * @Date: 2021/1/7 16:47
 * @Description:
 * spring.handlers
 * spring.schemas
 * spring.tooling
 */
public class SpringSourceTest {

    public static void main(String[] args) {
        ApplicationContext context = new MyClassPathXmlApplicationContext("application.xml");
//        UserEntity user = (UserEntity)context.getBean("user");
//        System.out.println(user.getBeanName());
//        System.out.println(user.getApplicationContext());




    }
}
