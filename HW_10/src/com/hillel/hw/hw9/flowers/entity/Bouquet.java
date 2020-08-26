package com.hillel.hw.hw9.flowers.entity.bouquet;

import com.hillel.hw.hw9.flowers.entity.accessories.Accessory;
import com.hillel.hw.hw9.flowers.entity.flovers.Flower;
import com.hillel.hw.hw9.flowers.exception.InvalidStemLengthException;
import com.hillel.hw.hw9.flowers.utils.ArrayUtils;

public class Bouquet {


    private Flower[] flowers;
    private Accessory[] accessories;
    private double price;

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public Bouquet() {

    }


    public void addFlower(Flower flower) {
        flowers = ArrayUtils.flowerArray(flowers, flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories = ArrayUtils.accessoryArray(accessories, accessory);
    }

    public double price() {
        int price = 0;
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    public Flower[] sortingFreshness() {

        Flower tempFlower = null;
        int n = flowers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (flowers[j - 1].getFreshnessLevel() > flowers[j].getFreshnessLevel()) {
                    tempFlower = flowers[j - 1];
                    flowers[j - 1] = flowers[j];
                    flowers[j] = tempFlower;
                }
            }
        }
        return flowers;
    }

    public Flower[] filterFlowersByStemLength(int minLength, int maxLength) throws InvalidStemLengthException {
        if (minLength < 0 || maxLength < 0) {
            throw new InvalidStemLengthException(minLength, maxLength);
        }
        Flower[] filteredFlowers = null;
        for (Flower flower : flowers) {
            if (flower.getLength() >= minLength && flower.getLength() <= maxLength) {
                filteredFlowers = (Flower[]) flower.extendArray(flower, filteredFlowers);
            }
        }
        return filteredFlowers;
    }


    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }


    @Override
    public String toString() {
        String out = "The bouquet price is " + price() + ": \n";
        int i = 1;
        for (Flower flower : flowers) {
            out = out + "    " + i + ". " + flower.toString() + "\n";
            i++;
        }
        for (Accessory accessory : accessories) {
            out = out + "    " + i + ". " + accessory.toString() + "\n";
            i++;
        }
        return out.toString();

    }


    public double getPrice() {
        return price;
    }


}
