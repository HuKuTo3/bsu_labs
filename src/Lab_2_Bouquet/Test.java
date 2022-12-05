package Lab_2_Bouquet;

//import Lab_2_Bouquet.Accessories.Tape;
//import Lab_2_Bouquet.Accessories.Wrapping;
//import Lab_2_Bouquet.Flowers.Carnation;
//import Lab_2_Bouquet.Flowers.Daisy;
//import Lab_2_Bouquet.Flowers.Sunflower;

public class Test {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addNewFlower(0);
        bouquet.addNewFlower(1);
        System.out.println(bouquet);
        bouquet.sortBouquetByFreshness();
        System.out.println(bouquet);
        System.out.println(bouquet.getFlowerInRange(10, 50));
    }
}
