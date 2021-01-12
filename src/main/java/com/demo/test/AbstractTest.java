package com.demo.test;

/**
 * @auther: wjx
 * @Date: 2021/1/10 11:53
 * @Description:
 */
public abstract class AbstractTest {

    String name;

    public AbstractTest(){
        System.out.println("抽象类构造方法");
        printName();
    }

    public void printName(){
        System.out.println("abstract方法");
    }



}
