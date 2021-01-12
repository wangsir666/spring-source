package com.demo.test;

/**
 * @auther: wjx
 * @Date: 2021/1/11 15:21
 * @Description:
 */
public class Parent {

    protected String name;

    public void test(){
        getName();
    }
    public String getName() {
        System.out.println("parent's getname");
        return name;
    }

    @Override
    public String toString() {
        System.out.println("tostring.....");
        final StringBuilder sb = new StringBuilder("Parent{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
