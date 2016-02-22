/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.spring.walls.springidol;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Dmitry
 */
public class OneManBand implements Performer {

    private String someNonNullProperty = "tadam";

    public String getSomeNonNullProperty() {
        return someNonNullProperty;
    }

    public void setSomeNonNullProperty(String someNonNullProperty) {
        this.someNonNullProperty = someNonNullProperty;
    }

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {

        for (String nameOfInstrument : instruments.keySet()) {

            System.out.println(":  " + nameOfInstrument);
            Instrument instrument = instruments.get(nameOfInstrument);
            instrument.play();
        }
        System.out.println(someNonNullProperty);
    }
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение коллекции инструментов
    }
}
