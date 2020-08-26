package com.hillel.hw.hw9.flowers.worker;


import com.hillel.hw.hw9.flowers.entity.accessories.Accessory;
import com.hillel.hw.hw9.flowers.entity.bouquet.Bouquet;
import com.hillel.hw.hw9.flowers.entity.flovers.Flower;
import com.hillel.hw.hw9.flowers.utils.ArrayUtils;

public class FlowersShop {

    private Bouquet[] bouquets = new Bouquet[0];
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];

    public void addBouquet(Bouquet bouquet) {
        bouquets = ArrayUtils.bouquetArray(bouquets, bouquet);
    }
    public void addAccessory(Accessory accessory) {
        accessories = ArrayUtils.accessoryArray(accessories, accessory);
    }
    public void addFlower(Flower flower) {
        flowers = ArrayUtils.flowerArray(flowers,flower);
    }

    public Bouquet[] createBouquet(Bouquet bouquet) {
        return bouquets = ArrayUtils.bouquetArray(bouquets, bouquet);
    }

    public Bouquet sortingFresh(Bouquet bouquet) {
        bouquet.sortingFreshness();
        return bouquet;
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

}
