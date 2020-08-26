package com.hillel.hw.hw9.flowers.entity.accessories;

public class Accessory {

    private String nameAccessory;
    private double price;

    public Accessory(String nameAccessory, double price) {
        this.nameAccessory = nameAccessory;
        this.price = price;
    }

    public String getNameAccessory() {
        return nameAccessory;
    }

    public void setNameAccessory(String nameAccessory) {
        this.nameAccessory = nameAccessory;
    }

    public String getName() {
        return nameAccessory;
    }

    public void setName(String name) {
        this.nameAccessory = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + nameAccessory + ", price: " + price;
    }
}
