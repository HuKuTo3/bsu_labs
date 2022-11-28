package Lab_2_Bouquet.Flowers;

public class Daisy extends Flower {
    public Daisy() {
        this.isFlowerFresh = true;
        this.stemLength = 25;
        this.price = 15;
    }

    public Daisy(boolean isFlowerFresh, double stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
    }
}
