////////////////////////////////////////////////////////////////////
// ORLANDO FERAZZANI 2058653
// NICOLÒ PELLEGRINELLI 2034334
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberOverFiveThousand extends Exception {
    public NumberOverFiveThousand() {
        super("Numeri sopra il 4999 non sono accettati. ");
    }
}