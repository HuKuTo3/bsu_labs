package Lab_2_Bouquet.SmallFlowers;

import Lab_2_Bouquet.Flower;

public class Daisy extends Flower {
    public Daisy() {
        this.isFlowerFresh = true;
        this.stemLength = 25;
        this.price = 15;
        this.size = "Small";
    }

    public Daisy(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Small";
    }
}
