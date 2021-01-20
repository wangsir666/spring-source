package com.demo.listener;

public class Observer {

    private String name;
    public Observer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void dealRun(Event event){
        if(1==event.getStatus()){
            System.out.println(this.name+" is dealing Run---"+event.getMessage());
        }
    }
}
