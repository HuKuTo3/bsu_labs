package Lab_2_Bouquet;

import Lab_2_Bouquet.Accessories.Accessory;
import Lab_2_Bouquet.Accessories.Tape;
import Lab_2_Bouquet.Accessories.Wrapping;
import Lab_2_Bouquet.Flowers.Carnation;
import Lab_2_Bouquet.Flowers.Daisy;
import Lab_2_Bouquet.Flowers.Flower;
import Lab_2_Bouquet.Flowers.Sunflower;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FactoryBouquet bouquet = new Bouquet();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("1. Add a flower");
            System.out.println("2. Add an accessory");
            System.out.println("3. Get information about the bouquet");
            System.out.println("4. Sort flowers");
            System.out.println("5. Get flower in range");
            System.out.println("6. Exit");
            int number = scanner.nextInt();
            System.out.println("\n");
            if (number == 1) {
                System.out.println("1. Carnation");
                ArrayList<Flower> flowers = new ArrayList<>();
                flowers.add(new Carnation());

                System.out.println("2. Daisy");
                flowers.add(new Daisy());

                System.out.println("3. Sunflower");
                flowers.add(new Sunflower());

                int number1 = scanner.nextInt();
                while (number1 < 1 || number1 > 3) {
                    System.out.println("Try again");
                    number1 = scanner.nextInt();
                }
                bouquet.addFlower(flowers.get(number1 - 1));
            }
            else if (number == 2) {
                System.out.println("1. Tape");
                ArrayList<Accessory> accessories = new ArrayList<>();
                accessories.add(new Tape());

                System.out.println("2. Wrapping");
                accessories.add(new Wrapping());

                int number1 = scanner.nextInt();
                while (number1 < 1 || number1 > 2) {
                    System.out.println("Try again");
                    number1 = scanner.nextInt();
                }
                bouquet.addAccessory(accessories.get(number1 - 1));
            }
            else if (number == 3) {
                System.out.println(bouquet);
            }
            else if (number == 4) {
                bouquet.sortBouquetByFreshness();
            }
            else if (number == 5) {
                System.out.println("First border: ");
                int number1 = scanner.nextInt();
                System.out.println("Second border: ");
                int number2 = scanner.nextInt();
                Flower flower = bouquet.getFlowerInRange(number1, number2);
                while (flower == null) {
                    System.out.println("Try again");
                    System.out.println("\n");
                    System.out.println("First border: ");
                    number1 = scanner.nextInt();
                    System.out.println("Second border: ");
                    number2 = scanner.nextInt();
                    flower = bouquet.getFlowerInRange(number1, number2);
                }
                System.out.println(flower);
            }
            else if (number == 6) {
                flag = false;
            }
            else {
                System.out.println("Try again");
            }
        }
    }
}
