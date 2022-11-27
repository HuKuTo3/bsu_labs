package Lab_2_Bouquet.SmallFlowers;

import Lab_2_Bouquet.Flower;

public class SmallFlower extends Flower {
    public SmallFlower() {
    }

    public SmallFlower(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Small";
    }
}
