package Lab_2_Bouquet.Flowers;

public class Sunflower extends Flower {
    public Sunflower() {
        this.isFlowerFresh = true;
        this.stemLength = 200;
        this.price = 250;
    }

    public Sunflower(boolean isFlowerFresh, double stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sunflower{" +
                "isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
