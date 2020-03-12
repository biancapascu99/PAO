package geometry;
//problema 6
public class Punct {

    private int x, y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punct() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return ("(" + this.x + ", " + this.y + ")");
    }

    public double distance(int x, int y) {
        return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
    }

    public double distance(Punct p1) {
        return (distance(p1.x, p1.y));
    }

}
