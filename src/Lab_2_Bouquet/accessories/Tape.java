package Lab_2_Bouquet.accessories;

public class Tape extends Accessory {
    private int length;
    private Color color;

    public enum Color {
        RED,
        BLUE,
        YELLOW,
        GREEN,
        BLACK
    }

    public Tape() {
        this(5, 30, Color.RED);
    }

    public Tape(int price, int length, Color color) {
        this.price = price;
        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tape{" +
                "length=" + length +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
