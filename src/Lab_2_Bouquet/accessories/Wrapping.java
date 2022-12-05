package Lab_2_Bouquet.accessories;

public class Wrapping extends Accessory {
    private Material material;

    public enum Material {
        PAPER,
        FILM,
        GRID,
        FELT
    }

    public Wrapping() {
        this(20, Material.PAPER);
    }

    public Wrapping(int price, Material material) {
        this.price = price;
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wrapping{" +
                "material=" + material +
                ", price=" + price +
                '}';
    }
}
