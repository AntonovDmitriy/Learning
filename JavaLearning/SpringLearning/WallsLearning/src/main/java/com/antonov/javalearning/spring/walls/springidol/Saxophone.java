/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.spring.walls.springidol;

/**
 *
 * @author Dmitry
 */
public class Saxophone implements Instrument {

    public Saxophone() {
    }

    /**
     *
     */
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
