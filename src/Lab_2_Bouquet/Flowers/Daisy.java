package Lab_2_Bouquet.Flowers;

import java.io.Serializable;

public class Daisy extends Flower implements Serializable {
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

    @Override
    public String toString() {
        return "Daisy{" +
                "isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
