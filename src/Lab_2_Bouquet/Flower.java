package Lab_2_Bouquet;

public class Flower {
    protected boolean isFlowerFresh;
    protected int stemLength;
    protected int price;
    protected String size;

    public Flower() {
    }

    @Override
    public String toString() {
        return "Flower{" +
                "isFlowerFresh=" + isFlowerFresh +
                ", stemLength=" + stemLength +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
