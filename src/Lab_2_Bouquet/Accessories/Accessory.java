package Lab_2_Bouquet.Accessories;

public abstract class Accessory {
    protected int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "price=" + price +
                "}\n";
    }
}
