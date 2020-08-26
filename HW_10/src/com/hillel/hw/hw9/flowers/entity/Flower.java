package com.hillel.hw.hw9.flowers.entity.flovers;

public class Flower {
    private String species;
    private String flowerColors;
    private int length;
    private double price;
    private int freshnessLevel;

    public Flower(String species, int length, double price, int freshnessLevel, String flowerColors) {
        this.species = species;
        this.length = length;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.flowerColors = flowerColors;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFlowerColors() {
        return flowerColors;
    }

    public void setFlowerColors(String flowerColors) {
        this.flowerColors = flowerColors;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(int freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    @Override
    public String toString() {
        return "Flower " + species + "Flower colors: " + flowerColors + ", stem length: " + length + ", lifetime: " + freshnessLevel + " price: " + price;
    }

    public Object extendArray(Flower flower, Flower[] filteredFlowers) {
        if (filteredFlowers == null) {
            Flower[] extendedArray = new Flower[1];
            extendedArray[0] = (Flower) flower;
            return extendedArray;
        } else {
            Flower[] extendedArray = new Flower[filteredFlowers.length + 1];
            for (int i = 0; i < filteredFlowers.length; i++) {
                extendedArray[i] = (Flower) filteredFlowers[i];
            }
            extendedArray[filteredFlowers.length] = (Flower) flower;
            return extendedArray;
        }
    }
}
