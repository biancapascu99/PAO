package Scoala;

public class Catalog {
    private String grupa;
    private Student s1, s2, s3, s4, s5;

    public Catalog(String grupa, Student s1, Student s2, Student s3, Student s4, Student s5) {
        this.grupa = grupa;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;

    }

    public String toString() {
        return "Grupa: " + grupa + "\nStudentii: " + s1 + s2 + s3 + s4 + s5;
    }

    public double getMedieClasa() {
        return (s1.getMedieAn1() + s2.getMedieAn1() + s3.getMedieAn1() + s4.getMedieAn1() + s5.getMedieAn1()) / 5;
    }

    public static void main(String[] args) {
        Catalog c = new Catalog("244", new Student("Maria", 7, 8), new Student("Gigel", 6, 7), new Student("Bianca", 8, 8), new Student("Ionel", 7, 6), new Student("Giorgica", 9, 5));
        System.out.println("Media este: " + c.getMedieClasa() + "\n");
        System.out.println(c);
    }
}
