package Lab_2_Bouquet.Flowers;

public abstract class Flower {
    protected boolean isFlowerFresh;
    protected double stemLength;
    protected int price;

    public boolean isFlowerFresh() {
        return isFlowerFresh;
    }

    public void setFlowerFresh(boolean flowerFresh) {
        isFlowerFresh = flowerFresh;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }
}
