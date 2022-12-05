package Lab_2_Bouquet.Flowers;

public class SmallFlower extends Flower{
    public SmallFlower() {
        this("Daisy", true, 25, 15);
    }

    public SmallFlower(String name, boolean isFlowerFresh, double stemLength, int price) {
        this.name = name;
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmallFlower{" +
                "name=" + name +
                ", isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
