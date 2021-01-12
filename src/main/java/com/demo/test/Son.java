package com.demo.test;

/**
 * @auther: wjx
 * @Date: 2021/1/11 15:21
 * @Description:
 */
public class Son extends Parent {
    @Override
    public String getName() {
        System.out.println("son's getname");
        return "son..";
    }

    public static void main(String[] args) {
        new Son().test();
    }
}
