package com.demo.cyc;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@ToString
public class ABA {

    private BAB bab;

    public void show(){
        bab.show();
        System.out.println("ABA....");
    }

    public void setBab(BAB bab) {
        this.bab = bab;
    }

    public BAB getBab() {
        return bab;
    }
}
