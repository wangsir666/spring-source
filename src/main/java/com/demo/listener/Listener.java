package com.demo.listener;

import java.util.ArrayList;
import java.util.List;

public class Listener {

    private List<Observer> observers = new ArrayList<>();

    public void publishEvent(final Event event) {
        if (observers == null || observers.size() < 1) {
            return;
        }
        observers.forEach(observer->observer.dealRun(event));

    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }

}
