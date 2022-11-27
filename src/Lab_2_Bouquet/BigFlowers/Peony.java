package Lab_2_Bouquet.BigFlowers;

import Lab_2_Bouquet.Flower;

public class Peony extends Flower {
    public Peony() {
        this.isFlowerFresh = true;
        this.stemLength = 100;
        this.price = 750;
        this.size = "Big";
    }

    public Peony(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Big";
    }
}
