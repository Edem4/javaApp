package com.company;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void seyHello() {
        System.out.println("Dog ");
    }
}
