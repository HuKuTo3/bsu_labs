package Lab_2_Bouquet.SmallFlowers;

import Lab_2_Bouquet.Flower;

public class Primrose extends Flower {
    public Primrose() {
        this.isFlowerFresh = true;
        this.stemLength = 15;
        this.price = 5;
        this.size = "Small";
    }

    public Primrose(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Small";
    }
}
