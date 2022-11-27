package Lab_2_Bouquet.BigFlowers;

import Lab_2_Bouquet.Flower;

public class Sunflower extends Flower {
    public Sunflower() {
        this.isFlowerFresh = true;
        this.stemLength = 200;
        this.price = 250;
        this.size = "Big";
    }

    public Sunflower(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Big";
    }
}
