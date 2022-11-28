package Lab_2_Bouquet;

import Lab_2_Bouquet.Accessories.Accessory;
import Lab_2_Bouquet.Flowers.Flower;

import java.util.ArrayList;

public class Bouquet extends FactoryBouquet{
    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }

    @Override
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addFlowers(ArrayList<Flower> flowers) {
        for (Flower flower : flowers) {
            addFlower(flower);
        }
    }

    @Override
    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void addAccessories(ArrayList<Accessory> accessories) {
        for (Accessory accessory : accessories) {
            addAccessory(accessory);
        }
    }

    @Override
    public String toString() {
        return  "\n" + flowers +
                "\n----------------------------------" +
                "\n" + accessories +
                "\n----------------------------------" +
                "\nPrice = " + calculateBouquetPrice() +
                "\n";
    }

    @Override
    public int calculateBouquetPrice() {
        int price = 0;

        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }

        return price;
    }

    @Override
    public void sortBouquetByFreshness() {
        ArrayList<Flower> freshFlowers = new ArrayList<>();
        ArrayList<Flower> notFreshFlowers = new ArrayList<>();

        for (Flower flower : flowers) {
            if(flower.isFlowerFresh()) {
                freshFlowers.add(flower);
            }
            else {
                notFreshFlowers.add(flower);
            }
        }

        flowers.removeAll(flowers);
        flowers.addAll(freshFlowers);
        flowers.addAll(notFreshFlowers);
    }

    @Override
    public Flower getFlowerInRange(double firstBorder, double secondBorder) {
        if (firstBorder < 0 || secondBorder < 0) {
            return null;
        } else if (firstBorder > secondBorder) {
            double temp = firstBorder;
            firstBorder = secondBorder;
            secondBorder = temp;
        }

        Flower flower = null;

        for (Flower flower1 : flowers) {
            if (flower1.getStemLength() >= firstBorder && flower1.getStemLength() <= secondBorder) {
                flower = flower1;
                break;
            }
        }

        return flower;
    }
}
