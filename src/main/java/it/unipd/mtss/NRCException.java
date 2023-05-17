////////////////////////////////////////////////////////////////////
// ORLANDO FERAZZANI 2058653
// NICOLÒ PELLEGRINELLI 2034334
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NRCException extends Exception {
    public NRCException(char c) {
        super("Lettera non valida: " + c);
    }
}