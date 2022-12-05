package Lab_2_Bouquet.Flowers;

import java.util.Random;

public class MediumFlower extends Flower {
    public MediumFlower() {
        this("Carnation", false, 80, 50);
    }

    public MediumFlower(String name, boolean isFlowerFresh, double stemLength, int price) {
        this.name = name;
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MediumFlower{" +
                "name=" + name +
                ", isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
