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

public enum CurrencyEnum {

    USD, EUR;

    @Override
    public String toString() {
        switch (this) {
            case USD:
                return "Доллары США";
            case EUR:
                return "Евро";
        }
        return "";
    }
}
