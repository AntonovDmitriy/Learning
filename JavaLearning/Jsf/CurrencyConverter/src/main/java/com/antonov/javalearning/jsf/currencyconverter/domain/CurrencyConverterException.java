/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.antonov.javalearning.jsf.currencyconverter.domain;

/**
 *
 * @author Antonov
 */
public class CurrencyConverterException extends Exception {

    /**
     * Creates a new instance of <code>CurrencyConverterException</code> without
     * detail message.
     */
    public CurrencyConverterException() {
    }

    /**
     * Constructs an instance of <code>CurrencyConverterException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CurrencyConverterException(String msg) {
        super(msg);
    }
}
