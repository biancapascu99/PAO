package problema8;
//Problema 8
public class Student {
    private String nume, prenume;
    public static int contor = 0;

    public Student() {
        this.nume = "";
        this.prenume = "";
        contor++;
    }

    public Student(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
        contor++;
    }

    public String toString() {
        return "Nume: " + nume + "\nPrenume: " + prenume + "\n";

    }

    public static void main(String[] args) {
        Student[] array = new Student[5];
        array[0] = new Student("Popa", "Ion");
        array[1] = new Student("Popescu", "Ionel");
        array[2] = new Student("Mardale", "Ioana");
        array[3] = new Student("Matei", "Maria");
        array[4] = new Student("Ionescu", "Gigel");

        for (Student i : array) {
            System.out.println(i);
        }
        System.out.println(Student.contor);
    }
}
