package Lab_2_Bouquet.MediumFlowers;

import Lab_2_Bouquet.Flower;

public class Narcissus extends Flower {
    public Narcissus() {
        this.isFlowerFresh = true;
        this.stemLength = 45;
        this.price = 100;
        this.size = "Medium";
    }

    public Narcissus(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Medium";
    }
}
