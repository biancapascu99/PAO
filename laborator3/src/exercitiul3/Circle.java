package exercitiul3;

public class Circle {

    private double radius;
    private String colour;

    public Circle() {
        this.radius = 1.0;
        this.colour = "red";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        final double PI = 3.14;
        return PI * (this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "Radius = " + radius + " colour = " + colour;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Circle)) {
            return false;
        }

        Circle c = (Circle) o;

        return Double.compare(this.radius, c.radius) == 0 && this.colour.equals(c.colour);
    }

}
