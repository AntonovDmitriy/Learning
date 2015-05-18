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
public class Sonnet29 implements Poem {

    private static String[] LINES = {
        "Когда в раздоре с миром и судьбой,",
        "Припомнив годы, полные невзгод,",
        "Тревожу я бесплодною мольбой",
        "Глухой и равнодушный небосвод",
        "И, жалуясь на горестный удел,",
        "Готов меняться жребием своим",
        "С тем, кто в искусстве больше преуспел,",
        "Богат надеждой и людьми любим, -",
        "Тогда, внезапно вспомнив о тебе,",
        "Я малодушье жалкое кляну,",
        "И жаворонком, вопреки судьбе,",
        "Моя душа несется в вышину.",
        "С твоей любовью, с памятью о ней",
        "Всех королей на свете я сильней."};

    public Sonnet29() {
    }

    @Override
    public void recite() {
        
        for (String LINES1 : LINES) {
            System.out.println(LINES1);
        }
    }
}
