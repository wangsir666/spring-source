package com.demo;

import com.demo.cyc.ABA;
import com.demo.entity.UserEntity;
import com.demo.entity.UserEntityFactory;
import com.demo.extention.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

//

    public static void main(String[] args) throws Exception{
        xmlApplicationContextTest();
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.demo");
    }

    private static void xmlApplicationContextTest() {
        ApplicationContext context = new MyClassPathXmlApplicationContext("application.xml");
//        factoryBeanTest(context);
        ABA aba = context.getBean(ABA.class);

    }

    /**
     * factroyBean测试
     * @param context
     * @throws Exception
     */
    private static void factoryBeanTest(ApplicationContext context) throws Exception {
        System.out.println("-----------------------------");
        System.out.println("************"+ context.getBean("userFactory"));
        System.out.println("************"+ context.getBean("&userFactory"));

        UserEntity user1 = context.getBean("userFactory", UserEntity.class);
        UserEntity user2 = context.getBean("userFactory", UserEntity.class);

        System.out.println(user1==user2);

        System.out.println("===============");

        UserEntityFactory userEntityFactory1 = context.getBean("&userFactory", UserEntityFactory.class);
        UserEntityFactory userEntityFactory2 = context.getBean("&userFactory", UserEntityFactory.class);
        System.out.println(userEntityFactory1==userEntityFactory2);


//        System.out.println(context.getBean(UserEntity.class));
        System.out.println(context.getBean(UserEntityFactory.class));
        System.out.println("*****************");


        UserEntity user = userEntityFactory1.getObject();
        System.out.println(user==user1);
    }
}
