package Lab_2_Bouquet.flowers;

public class WildFlower extends Flower {
    private foodType type;
    private boolean isIlluminated;

    public enum foodType {
        USUAL,
        PREDATOR
    }

    public WildFlower() {
        this("Sunflower", false, 200, 250, foodType.USUAL, true);
    }

    public WildFlower(String name, boolean isFlowerFresh, double stemLength, int price, foodType type, boolean isIlluminated) {
        this.name = name;
        this.isFlowerFresh = isFlowerFresh;
        this.stemLength = stemLength;
        this.price = price;
        this.type = type;
        this.isIlluminated = isIlluminated;
    }

    public foodType getType() {
        return type;
    }

    public void setType(foodType type) {
        this.type = type;
    }

    public boolean isIlluminated() {
        return isIlluminated;
    }

    public void setIlluminated(boolean illuminated) {
        isIlluminated = illuminated;
    }

    @Override
    public String toString() {
        return "Wild{" +
                "type=" + type +
                ", isIlluminated=" + isIlluminated +
                ", name='" + name + '\'' +
                ", isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
