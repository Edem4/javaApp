package com.company;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("edem");
        for (int i = 0; i < 10; i++) {

            words.add("number " + i);
        }
         for(String str: words){
             if(str.contains("edem")) continue;
             System.out.println(str);
         }
    }
}
