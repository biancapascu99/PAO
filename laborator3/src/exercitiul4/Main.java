package exercitiul4;

public class Main {

    public static void main(String[] args) {

        Produs fp1 = new FoodProduct("Oua", 20.23, 5, false);
        Produs fp2 = new FoodProduct("Branza", 14.43, 10, true);
        Produs cp1 = new CleaningProduct("Sapun", 5.77, 10, false);
        Produs cp2 = new CleaningProduct("Dero", 25.89, 6, true);
        Produs fup1 = new FurnitureProduct("Canapea", 300, 2, false);
        Produs clop1 = new ClotheProduct("Bluza", 50.21, 5, false);

        System.out.println("Produsele sunt: \n" + "---FoodProduct---\n" + fp1 + fp2 + "---CleaningProduct---\n" + cp1 + cp2 + "---FurnitureProduct---\n"
                + fup1 + "---ClotheProduct---\n" + clop1);
        System.out.println("Produsele dupa rotunjirea pretului: \n" + "---FoodProduct---\n" + fp1.getName() + fp1.roundPrice() + " " + fp2.getName() + fp2.roundPrice() + "\n---CleaningProduct---\n" +
                cp1.getName() + cp1.roundPrice() + " " + cp2.getName() + cp2.roundPrice() + "\n---FurnitureProduct---\n" + fup1.getName() + fup1.roundPrice() +
                "\n---ClotheProduct---\n" + clop1.getName() + clop1.roundPrice());
        System.out.println("Produsele dupa reducerea pretului: \n" + "---FoodProduct---\n" + fp1.getName() + fp1.reduceBy(0.2) + " " + fp2.getName() + fp2.reduceBy(0.2) + "\n---CleaningProduct---\n" +
                cp1.getName() + cp1.reduceBy(0.4) + " " + cp2.getName() + cp2.reduceBy(0.5) + "\n---FurnitureProduct---\n" + fup1.getName() + fup1.reduceBy(0.1) +
                "\n---ClotheProduct---\n" + clop1.getName() + clop1.reduceBy(0.3));
        System.out.println("Verificare produse expirate (0->expirat, pret->neexpirat): \n" + "---FoodProduct---\n" + fp1.getName() + fp1.priceForExpired() + " " + fp2.getName() + fp2.priceForExpired() +
                "\n---CleaningProduct---\n" + cp1.getName() + cp1.priceForExpired() + " " + cp2.getName() + cp2.priceForExpired() + "\n---FurnitureProduct---\n" +
                fup1.getName() + fup1.priceForExpired() + "\n---ClotheProduct---\n" + clop1.getName() + clop1.priceForExpired());



    }


}
