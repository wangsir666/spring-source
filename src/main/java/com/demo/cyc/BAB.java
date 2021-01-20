package com.demo.cyc;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@ToString
public class BAB {

    private ABA aba;

    public void show(){
        System.out.println("BAB....");
    }

    public void setAba(ABA aba) {
        this.aba = aba;
    }

    public ABA getAba() {
        return aba;
    }
}
