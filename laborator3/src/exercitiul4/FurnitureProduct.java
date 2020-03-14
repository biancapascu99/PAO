package exercitiul4;

public class FurnitureProduct extends Produs {

    public FurnitureProduct(String name, double price, int quantity, boolean isExpired) {
        super(name, price, quantity, isExpired);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int roundPrice() {
        return (int) this.price;
    }

    @Override
    public double reduceBy(double x) {
        return this.price * x;
    }

    @Override
    public double priceForExpired() {
        if (this.isExpired == true) {
            this.price = 0;
            return 0;
        }
        return this.price;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
