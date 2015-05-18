package com.antonov.javalearning.purejava.java8.lambda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Antonov
 */
public class LambdaSimple {

    public static void main(String[] args) {

        //-------------------------------Comparator
        //Old example
        String[] stringArray = {"Dima", "Ivan", "Alex"};
        Arrays.sort(stringArray, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        Arrays.sort(stringArray, (String x, String y) -> Integer.compare(x.length(), y.length()));

        Comparator<String> lenghtComparator = (x, y) -> Integer.compare(x.length(), y.length());

        Arrays.sort(stringArray,lenghtComparator);
        
        
        //-------------------------Thread--------------------------------------------
        Thread my = new Thread(() -> {
            System.out.println("Hello");
        });

        Runnable runnable = () -> System.out.println("hello");
        
    }

}
