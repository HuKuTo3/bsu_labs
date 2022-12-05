package Lab_2_Bouquet.flowers;

public class HomeFlower extends Flower {
    private boolean isInFlowerPot;

    public HomeFlower() {
        this("Carnation", false, 80, 50, true);
    }

    public HomeFlower(String name, boolean isFlowerFresh, double stemLength, int price, boolean isInFlowerPot) {
        this.name = name;
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.isInFlowerPot = isInFlowerPot;
    }

    public boolean isInFlowerPot() {
        return isInFlowerPot;
    }

    public void setInFlowerPot(boolean inFlowerPot) {
        isInFlowerPot = inFlowerPot;
    }

    @Override
    public String toString() {
        return "Home{" +
                "isInFlowerPot=" + isInFlowerPot +
                ", name='" + name + '\'' +
                ", isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
