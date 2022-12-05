package Lab_2_Bouquet;

//import Lab_2_Bouquet.Accessories.Tape;
//import Lab_2_Bouquet.Accessories.Wrapping;
//import Lab_2_Bouquet.Flowers.Carnation;
//import Lab_2_Bouquet.Flowers.Daisy;
//import Lab_2_Bouquet.Flowers.Sunflower;

import Lab_2_Bouquet.Flowers.BigFlower;
import Lab_2_Bouquet.Flowers.Flower;
import Lab_2_Bouquet.Flowers.MediumFlower;
import Lab_2_Bouquet.Flowers.SmallFlower;

public class Test {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addNewFlower(0);
        bouquet.addNewFlower(1);
        bouquet.addNewFlower(2);
        System.out.println(bouquet);
        bouquet.sortBouquetByFreshness();
        System.out.println(bouquet);
        System.out.println(bouquet.getFlowerInRange(10, 50));




//        FactoryBouquet bouquet = new Bouquet();
//        bouquet.addFlower(new Daisy());
//        bouquet.addFlower(new Carnation());
//        bouquet.addFlower(new Sunflower());
//        System.out.println(bouquet);
//        bouquet.sortBouquetByFreshness();
//        System.out.println(bouquet);
//        bouquet.addAccessory(new Tape());
//        bouquet.addAccessory(new Wrapping());
//        System.out.println(bouquet);
//        System.out.println(bouquet.getFlowerInRange(10, 50));
    }
}
