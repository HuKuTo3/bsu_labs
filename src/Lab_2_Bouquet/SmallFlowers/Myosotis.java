package Lab_2_Bouquet.SmallFlowers;

import Lab_2_Bouquet.Flower;

public class Myosotis extends Flower {
    public Myosotis() {
        this.isFlowerFresh = true;
        this.stemLength = 20;
        this.price = 10;
        this.size = "Small";
    }

    public Myosotis(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Small";
    }
}
