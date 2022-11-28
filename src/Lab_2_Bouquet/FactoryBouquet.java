package Lab_2_Bouquet;

import Lab_2_Bouquet.Accessories.Accessory;
import Lab_2_Bouquet.Flowers.Flower;

import java.util.ArrayList;

public abstract class FactoryBouquet {
    ArrayList<Flower> flowers;
    ArrayList<Accessory> accessories;

    public abstract void addFlower(Flower flower);

    public abstract void addAccessory(Accessory accessory);

    public abstract int calculateBouquetPrice();

    public abstract void sortBouquetByFreshness();

    public abstract Flower getFlowerInRange(double firstBorder, double secondBorder);
}