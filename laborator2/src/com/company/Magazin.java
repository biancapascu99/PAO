package com.company;

//Problema 7
public class Magazin {
    private String nume;
    private Produs p1, p2, p3;

    public Magazin(String nume, Produs p1, Produs p2, Produs p3) {
        this.nume = nume;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String toString() {
        return "Nume magazin :" + nume + "\n" + p1 + p2 + p3;
    }

    public double getTotalMagazin() {
        return p1.getTotalProdus() + p2.getTotalProdus() + p3.getTotalProdus();

    }

    public static void main(String[] args) {
        Magazin M = new Magazin("Emag", new Produs("Telefon", 1000, 5), new Produs("Televizor", 4000, 3), new Produs("Cuptor", 200, 6));
        System.out.println(M);
        System.out.println(M.getTotalMagazin());
    }
}
