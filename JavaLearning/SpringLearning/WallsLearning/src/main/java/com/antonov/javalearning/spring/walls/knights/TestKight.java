/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.spring.walls.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Dmitry
 */
public class TestKight {
    
    public static void main(String[] args) throws QuestException {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();
    }
}
