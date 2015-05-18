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
public class Stage {

    private Stage() {
    }

    private static class StageHolder {

        static Stage stage = new Stage();

        static Stage instance() {
            return stage;
        }
    }

    public Stage getInstance() {
        return StageHolder.instance();
    }
}
