package com.demo.extention;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @auther: wjx
 * @Date: 2021/1/10 13:23
 * @Description:
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configs){
        super(configs);
    }

    @Override
    protected void initPropertySources() {
//        System.out.println("asdfasd");
        //添加必须的属性aaaa，
        // 在AbstractApplicationContext.prepareRefresh中会校验
        // 校验必须的属性值----getEnvironment().validateRequiredProperties();
//        getEnvironment().setRequiredProperties("aaaa");
//        getEnvironment().setActiveProfiles("test");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//        super.setAllowBeanDefinitionOverriding(false);
//        super.setAllowCircularReferences(false);
//        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
//        super.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
        super.customizeBeanFactory(beanFactory);
    }

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException, IOException {
        // Create a new XmlBeanDefinitionReader for the given BeanFactory.
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        // Configure the bean definition reader with this context's
        // resource loading environment.
        beanDefinitionReader.setEnvironment(this.getEnvironment());
        beanDefinitionReader.setResourceLoader(this);
        beanDefinitionReader.setEntityResolver(new ResourceEntityResolver(this));

        // Allow a subclass to provide custom initialization of the reader,
        // then proceed with actually loading the bean definitions.
        initBeanDefinitionReader(beanDefinitionReader);
        loadBeanDefinitions(beanDefinitionReader);
    }


    @Override
    public void addBeanFactoryPostProcessor(BeanFactoryPostProcessor postProcessor) {
        super.addBeanFactoryPostProcessor(postProcessor);
    }
}
