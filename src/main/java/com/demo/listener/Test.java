package com.demo.listener;

public class Test {

    public static void main(String[] args) {

        Person p = new Person();
        Listener listener = new Listener();
        Observer observer1 = new Observer("aaa");
        Observer observer2 = new Observer("bbb");

        p.addListener(listener);
        listener.addObserver(observer1);
        listener.addObserver(observer2);

        p.run();











    }
}
