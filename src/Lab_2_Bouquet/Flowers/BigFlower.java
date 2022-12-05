package Lab_2_Bouquet.Flowers;

public class BigFlower extends Flower{
    public BigFlower() {
        this("Sunflower", false, 200, 250);
    }

    public BigFlower(String name, boolean isFlowerFresh, double stemLength, int price) {
        this.name = name;
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BigFlower{" +
                "name=" + name +
                ", isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
