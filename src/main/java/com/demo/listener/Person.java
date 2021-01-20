package com.demo.listener;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener){
        listeners.add(listener);
    }

    public void run(){
        System.out.println("perosn will run...");
        Event event = new Event();
        event.setMessage("run");
        event.setStatus(1);
        listeners.forEach(listener -> listener.publishEvent(event));
    }
}
