package Lab_2_Bouquet.BigFlowers;

import Lab_2_Bouquet.Flower;

public class Hydrangea extends Flower {
    public Hydrangea() {
        this.isFlowerFresh = true;
        this.stemLength = 150;
        this.price = 500;
        this.size = "Big";
    }

    public Hydrangea(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Big";
    }
}
