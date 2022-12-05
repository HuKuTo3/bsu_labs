package Lab_2_Bouquet.flowers;

public abstract class Flower implements Comparable<Flower>{
    protected String name;
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
                "name=" + name +
                ", isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                "}\n";
    }

    @Override
    public int compareTo(Flower o) {
        int val1 = (this.isFlowerFresh()) ? 1 : 0;
        int val2 = (o.isFlowerFresh()) ? 1 : 0;
        return val1 - val2;
    }

    // двухфакторный конструктор
}
