package com.company;

import java.security.PublicKey;

public class Animal {

    private String name;
    public Animal(String name){
        this.name=name;
    }

    public void seyHello(){
        System.out.println("Animal " + name);
    }
}
