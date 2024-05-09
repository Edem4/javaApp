package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        System.out.println(num.get(0));
        for (int i = 0; i < 100; i++) {
            num.add(i);
        }
        System.out.println(num);
        System.out.println(num.size());
        for( int e: num) System.out.println(e);
    }
}
