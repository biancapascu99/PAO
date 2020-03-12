package Scoala;

public class Student {
    private String nume;
    private double medieSem1;
    private double medieSem2;

    public Student(String nume, double medieSem1, double medieSem2) {
        this.nume = nume;
        this.medieSem1 = medieSem1;
        this.medieSem2 = medieSem2;
    }
    public Student() {
        this("",0,0);
    }

    public String toString() {
        return "Nume: " + nume + "\nMedieSem1: " + medieSem1 + "\nMedieSem2: " + medieSem2 + "\n";
    }

    public double getMedieAn1() {
        return (medieSem1 + medieSem2) / 2;
    }
}
