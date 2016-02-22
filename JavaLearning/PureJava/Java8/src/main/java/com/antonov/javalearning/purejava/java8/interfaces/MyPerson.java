/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.purejava.java8.interfaces;

/**
 *
 * @author Antonov
 */
public class MyPerson extends Person implements IPerson {

    public static void main(String[] args) {

        MyPerson per = new MyPerson();
        System.out.println(per.getName());   //    ALEX .....NOT DIMA
        IPerson per2 = new MyPerson();
        System.out.println(per2.getName());
        
    }

    @Override
    public long getId() {
        return 0L;
    }
}
