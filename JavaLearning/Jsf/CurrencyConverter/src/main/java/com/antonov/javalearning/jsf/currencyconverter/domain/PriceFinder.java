/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.jsf.currencyconverter.domain;

import java.math.BigDecimal;

/**
 *
 * @author Antonov
 */
public class PriceFinder {

    private static PriceFinder finder;

    private PriceFinder() {

    }

    public static PriceFinder getInstance() {

        if (finder == null) {
            finder = new PriceFinder();
        }
        return finder;
    }

    public BigDecimal getCurrentPrice(CurrencyEnum currency) {

        return mockDefaultPrice(currency);
    }

    private BigDecimal mockDefaultPrice(CurrencyEnum currency) {

        switch (currency) {
            case USD:
                return new BigDecimal("37");
            case EUR:
                return new BigDecimal("49");
        }
        return null;
    }
}
