package Lab_2_Bouquet;

import Lab_2_Bouquet.accessories.Accessory;
import Lab_2_Bouquet.flowers.Flower;
import Lab_2_Bouquet.flowers.HomeFlower;
import Lab_2_Bouquet.flowers.WildFlower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bouquet {
    List<Flower> flowers;
    List<Accessory> accessories;

    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addFlowers(ArrayList<Flower> flowers) {
        for (Flower flower : flowers) {
            addFlower(flower);
        }
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void addAccessories(ArrayList<Accessory> accessories) {
        for (Accessory accessory : accessories) {
            addAccessory(accessory);
        }
    }

    public void addNewFlower(int mode) {
        switch(mode) {
            case 0:
                addFlower(new HomeFlower());
            case 1:
                addFlower(new WildFlower());
            default:
                throw new IllegalArgumentException("illegal mode");
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

    public void sortBouquetByFreshness() {
        Collections.sort(flowers);
    }

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
