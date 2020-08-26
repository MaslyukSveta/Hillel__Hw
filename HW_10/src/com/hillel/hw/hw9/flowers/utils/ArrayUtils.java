package com.hillel.hw.hw9.flowers.utils;


import com.hillel.hw.hw9.flowers.entity.accessories.Accessory;
import com.hillel.hw.hw9.flowers.entity.bouquet.Bouquet;
import com.hillel.hw.hw9.flowers.entity.flovers.Flower;

public class ArrayUtils {

    public static Flower[] flowerArray(Flower[] firstFlower, Flower secondFlower) {

        Flower[] modified = new Flower[firstFlower.length + 1];
        for (int i = 0; i < firstFlower.length; i++) {
            modified[i] = firstFlower[i];
        }
        modified[firstFlower.length] = secondFlower;
        return modified;

    }

    public static Accessory[] accessoryArray(Accessory[] firstAccessory, Accessory secondAccesory) {

        Accessory[] modified = new Accessory[firstAccessory.length + 1];
        for (int i = 0; i < firstAccessory.length; i++) {
            modified[i] = firstAccessory[i];
        }
        modified[firstAccessory.length] = secondAccesory;
        return modified;

    }

    public static Bouquet[] bouquetArray(Bouquet[] firstBouquet, Bouquet secondBouquet) {

        Bouquet[] modified = new Bouquet[firstBouquet.length + 1];
        for (int i = 0; i < firstBouquet.length; i++) {
            modified[i] = firstBouquet[i];
        }
        modified[firstBouquet.length] = secondBouquet;
        return modified;
    }

}
