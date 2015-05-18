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

class PerformanceException extends Exception {

    public PerformanceException() {
    }

    public PerformanceException(String message) {
        super(message);
    }

    public PerformanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PerformanceException(Throwable cause) {
        super(cause);
    }

    public PerformanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
