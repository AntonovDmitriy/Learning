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
public class Instrumentalist implements Performer {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    private String song;

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }
    private Instrument instrument;

    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }
}
