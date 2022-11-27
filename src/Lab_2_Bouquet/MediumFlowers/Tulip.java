package Lab_2_Bouquet.MediumFlowers;

import Lab_2_Bouquet.Flower;

public class Tulip extends Flower {
    public Tulip() {
        this.isFlowerFresh = true;
        this.stemLength = 45;
        this.price = 150;
        this.size = "Medium";
    }

    public Tulip(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Medium";
    }
}
