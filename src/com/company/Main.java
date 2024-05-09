package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        Dog dog = new Dog("doog");
        Cat cat = new Cat("caaat");

        test(animal);
        test(cat);
        test(dog);

    }
    public static void test(Animal animal){
        animal.seyHello();
    }
}



