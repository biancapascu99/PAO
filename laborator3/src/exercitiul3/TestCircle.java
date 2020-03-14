package exercitiul3;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5, "blue");
        Circle c3 = new Circle(2.1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Culoarea cercului 1 este " + c1.getColour());
        System.out.println("Raza cercului 3 este " + c3.getRadius());
        c1.setColour("pink");
        System.out.println("Acum culoarea cercului 1 este " + c1.getColour());
        c3.setRadius(7);
        System.out.println("Acum raza cercului 3 este " + c3.getRadius());
        System.out.println("Aria cercului 2 este " + c2.getArea());
        System.out.println("Cercul 1 si 3 sunt egale? \n" + c1.equals(c2));
    }
}
