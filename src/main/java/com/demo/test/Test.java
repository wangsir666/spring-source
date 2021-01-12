package com.demo.test;

/**
 * @auther: wjx
 * @Date: 2021/1/10 11:54
 * @Description:
 */
public class Test extends AbstractTest {
    @Override
    public void printName() {
        this.name="test";
        System.out.println(name);
    }

    public static void main(String[] args) {
//        Test t = new Test();
//        AbstractTest test = (AbstractTest)t;
//        test.printName();

        Parent parent = new Parent();
        parent.name="asdfasdfas";

        Son son = new Son();


    }
}
