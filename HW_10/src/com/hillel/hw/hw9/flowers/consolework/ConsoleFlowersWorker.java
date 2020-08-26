package com.hillel.hw.hw9.flowers.consolework;

import com.hillel.hw.hw9.flowers.entity.accessories.Accessory;
import com.hillel.hw.hw9.flowers.entity.bouquet.Bouquet;
import com.hillel.hw.hw9.flowers.entity.flovers.Flower;
import com.hillel.hw.hw9.flowers.exception.InvalidStemLengthException;
import com.hillel.hw.hw9.flowers.worker.FlowersShop;

import java.util.Arrays;
import java.util.Scanner;


public class ConsoleFlowersWorker {

    private FlowersShop flowersShop;
    private Scanner scanner;

    public ConsoleFlowersWorker(FlowersShop flowersShop) {
        this.flowersShop = flowersShop;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        FlowersShop shop = new FlowersShop();
        ConsoleFlowersWorker flowersWorker = new ConsoleFlowersWorker(shop);
        flowersWorker.start();
        flowersWorker.stop();
    }

    public void start() {
        int choise = 0;
        do {
            System.out.println("1. Create bouquet");
            System.out.println("2. Bouquets operations");
            System.out.println("3. Print current bouquets");
            System.out.println("0. Exit");

            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    Bouquet createdBouquet = createBouquet();
                    flowersShop.addBouquet(createdBouquet);
                    System.out.println("Created bouquet price -> " + createdBouquet.getPrice());
                    createBouquet();
                    break;
                case 2:
                    bouquetChoosing();
                    break;
                case 3:
                    bouquetChoosing();
                    break;
                case 0:
                    return;
            }
        } while (choise != 0);
    }


    private Bouquet editBouquet(Bouquet bouquet) {
        int choise = 0;
        do {
            System.out.println(bouquet);
            System.out.println("1. Sort flowers by days to live");
            System.out.println("2. Find flowers by stem length");
            System.out.println("3. Bouquet price");
            System.out.println("4. Add flower");
            System.out.println("5. Add accessory");
            System.out.println("0. Exit");

            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    bouquet.sortingFreshness();
                    System.out.println(bouquet);
                    break;
                case 2:
                    System.out.println(Arrays.toString(findFlowers(bouquet)));
                    break;
                case 3:
                    System.out.println("Price -> " + bouquet.getPrice());
                    break;
                case 4:
                    bouquet.addFlower(createFlower());
                    break;
                case 5:
                    bouquet.addAccessory(createAccessory());
                    break;
                case 0:
                    break;
            }
        } while (choise != -1);
        return bouquet;
    }


    private Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet();
        int choise = 0;
        do {
            System.out.println("1. Create flowers");
            System.out.println("2. Create accessories");
            System.out.println("0. Back");

            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    createFlowers(bouquet);
                    break;
                case 2:
                    createAccessories(bouquet);
                    break;
                case 0:
                    break;
            }
        } while (choise != 0);

        return bouquet;
    }

    private void createFlowers(Bouquet bouquet) {
        Flower[] result = new Flower[0];
        int choice = 0;

        do {
            System.out.println("1. New flower");
            System.out.println("0. Back");

            int choise = scanner.nextInt();

            if (choice == 1) {
                bouquet.addFlower(createFlower());
            }
        } while (choice != 0);

    }

    private Flower createFlower() {

        System.out.println("Name -> ");
        String species = scanner.next();

        System.out.println("FlowerColors -> ");
        String flowerColors = scanner.next();

        System.out.println("Price -> ");
        double price = scanner.nextInt();

        System.out.println("Days to live -> ");
        int freshnessLevel = scanner.nextInt();

        System.out.println("Stem length -> ");
        int stemLength = scanner.nextInt();

        return new Flower(species, stemLength, price, freshnessLevel, flowerColors);
    }

    private void createAccessories(Bouquet bouquet) {

        int choise = 0;

        do {
            System.out.println("1. New accessory");
            System.out.println("0. Back");

            choise = scanner.nextInt();

            if (choise == 1) {
                bouquet.addAccessory(createAccessory());
            }
        } while (choise != 0);
    }

    private Accessory createAccessory() {

        System.out.println("Name -> ");
        String nameAccessory = scanner.next();

        System.out.println("Price -> ");
        double price = scanner.nextInt();

        return new Accessory(nameAccessory, price);
    }

    private void bouquetChoosing() {
        int choice = 0;
        System.out.println("Choose bouquet");
        for (int i = 0; i < flowersShop.getBouquets().length; i++) {
            System.out.println(i + " ->" + "\n" + flowersShop.getBouquets()[i]);
        }
        System.out.println("-1 to exit");
        choice = scanner.nextInt();
        if (choice == -1) {
            return;
        } else {
            flowersShop.getBouquets()[choice] = editBouquet(flowersShop.getBouquets()[choice]);
        }
    }

    private Flower[] findFlowers(Bouquet bouquet) {
        Flower[] filteredFlowers = null;
        System.out.println("Min length -> ");
        int minLength = scanner.nextInt();

        System.out.println("Max length -> ");
        int maxLength = scanner.nextInt();
        try {
            Flower[] finded = bouquet.filterFlowersByStemLength(minLength, maxLength);
            System.out.println("Founded flowers: ");
            System.out.println(Arrays.toString(finded));
        } catch (InvalidStemLengthException e) {
            e.printStackTrace();
        }
        return filteredFlowers;
    }


    public FlowersShop getFlowersShop() {
        return flowersShop;
    }

    public void setFlowersShop(FlowersShop flowersShop) {
        this.flowersShop = flowersShop;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void stop() {
        scanner.close();
    }

}
