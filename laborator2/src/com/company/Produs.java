package com.company;

import geometry.Punct;

public class Produs {
    private String nume;
    private double pret;
    private int cantitate;

    public Produs() {
        this.nume = "";
        this.pret = 0;
        this.cantitate = 0;
    }

    public Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public String toString() {
        return "Produs: " + nume + "\n pret: " + pret + "\n cantitate: " + cantitate + "\n";
    }

    public double getTotalProdus() {
        return cantitate * pret;
    }
}
