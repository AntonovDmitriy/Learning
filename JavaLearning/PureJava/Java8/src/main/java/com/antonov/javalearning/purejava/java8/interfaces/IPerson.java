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
public interface IPerson {

    long getId();

    default String getName() {
        return "Dima";
    }
}
