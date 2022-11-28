package Lab_2_Bouquet.Flowers;

public class Carnation extends Flower {
    public Carnation() {
        this.isFlowerFresh = false;
        this.stemLength = 80;
        this.price = 50;
    }

    public Carnation(boolean isFlowerFresh, double stemLength, int price) {
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carnation{" +
                "isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
