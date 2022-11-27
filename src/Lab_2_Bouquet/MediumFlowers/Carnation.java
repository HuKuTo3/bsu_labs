package Lab_2_Bouquet.MediumFlowers;

import Lab_2_Bouquet.Flower;

public class Carnation extends Flower {
    public Carnation() {
        this.isFlowerFresh = true;
        this.stemLength = 80;
        this.price = 50;
        this.size = "Medium";
    }

    public Carnation(boolean isFlowerFresh, int stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.size = "Medium";
    }
}
