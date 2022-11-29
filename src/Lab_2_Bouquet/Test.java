package Lab_2_Bouquet;

import Lab_2_Bouquet.Accessories.Tape;
import Lab_2_Bouquet.Accessories.Wrapping;
import Lab_2_Bouquet.Flowers.Carnation;
import Lab_2_Bouquet.Flowers.Daisy;
import Lab_2_Bouquet.Flowers.Sunflower;

public class Test {
    public static void main(String[] args) {
        FactoryBouquet bouquet = new Bouquet();
        bouquet.addFlower(new Daisy());
        bouquet.addFlower(new Carnation());
        bouquet.addFlower(new Sunflower());
        System.out.println(bouquet);
        bouquet.sortBouquetByFreshness();
        System.out.println(bouquet);
        bouquet.addAccessory(new Tape());
        bouquet.addAccessory(new Wrapping());
        System.out.println(bouquet);
        System.out.println(bouquet.getFlowerInRange(10, 50));
    }
}
