package com.antonov.purejavalearning.lambda;

import java.util.Arrays;
import java.util.Comparator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antonov
 */
public class MethodLinks {

    public static void main(String[] args) {

        String[] stringArray = {"Dima", "Ivan", "Alex"};
        Arrays.sort(stringArray, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}
