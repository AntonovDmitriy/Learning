/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.spring.walls.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Dmitry
 */
public class TestIdol {
 
    
    public static void main(String[] args) throws PerformanceException {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("springidol.xml");
//        Performer performer = (Performer)context.getBean("Duke");
//        performer.perform();
//        
//        Performer marta = (Performer)context.getBean("Marta");
//        marta.perform();        
//        
//        Performer kenny = (Performer)context.getBean("Kenny");
//        kenny.perform();

        Performer kenny = (Performer)context.getBean("Karl");
        kenny.perform(); 
        
    }
}
