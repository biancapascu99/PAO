package exercitiul4;

public abstract class Produs {

    protected String name;
    protected double price;
    protected int quantity;
    protected boolean isExpired;

    public Produs(String name, double price, int quantity, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isExpired = isExpired;
    }

    public abstract int roundPrice();

    public abstract double reduceBy(double x);

    public abstract double priceForExpired();

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Nume produs: " + this.name + "\nPret: " + this.price + "\nCantitate: " + this.quantity + "\nExpirat:" + this.isExpired + "\n";
    }
}
