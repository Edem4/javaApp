package com.company;

public class Cat extends Animal{
    private String name;
    public Cat(String name) {
        super(name);
    }

    @Override
    public void seyHello() {
        System.out.println("Cat " +name);
    }
}
