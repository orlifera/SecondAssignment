////////////////////////////////////////////////////////////////////
// ORLANDO FERAZZANI 2058653
// NICOLÒ PELLEGRINELLI 2034334
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberBelowZeroException extends Exception {
    public NumberBelowZeroException() {
        super("Non esistono numeri romani negativi.");
    }
}