/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.jsf.currencyconverter.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Antonov
 */
@ManagedBean
@SessionScoped
public class CurrencyConverterMain implements Serializable {

    /*
     Tasks
     1) Conversion after button click
     2) Conversion after focus lost
     3) Conversion on air
     4) Ajax
     */
    
    private BigDecimal amount;

//    @Enumerated(EnumType.STRING)
    private CurrencyEnum currentCurrency;

    private BigDecimal currentPrice;
    private BigDecimal resultConverterValue;
    private String errorMessageConversion;

//    private Map<String, Object> mapCurrency;
    public CurrencyEnum[] getMap() {
        return CurrencyEnum.values();
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getErrorMessageConversion() {
        return errorMessageConversion;
    }

    public void setErrorMessageConversion(String messageConversion) {
        this.errorMessageConversion = messageConversion;
    }

    public BigDecimal getResultConverterValue() {
        return resultConverterValue;
    }

    public void setResultConverterValue(BigDecimal resultConverterValue) {
        this.resultConverterValue = resultConverterValue;
    }

    public CurrencyEnum getCurrentCurrency() {
        return currentCurrency;
    }

    public void setCurrentCurrency(CurrencyEnum currentCurrency) {
        this.currentCurrency = currentCurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CurrencyConverterMain() {
    }

    public void doConvertion() {

        try {
            if (amount == null) {
                throw new CurrencyConverterException("Введите количество в выбранной валюте");
            }
            if (currentCurrency == null) {
                throw new CurrencyConverterException("Выберете валюту");
            }

            currentPrice = PriceFinder.getInstance().getCurrentPrice(currentCurrency);
            resultConverterValue = amount.divide(currentPrice, MathContext.DECIMAL32);
        } catch (CurrencyConverterException | RuntimeException ex) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, ex.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public void clear() {
        amount = null;
        currentCurrency = null;
        currentPrice = null;
        resultConverterValue = null;
        errorMessageConversion = null;
    }

}
