package com.hillel.hw.hw15.taxPark.vehicle;

public class Sedan extends Car {

    private String comfortClass;

    public Sedan(String brand, String model, int price, int maxiSpeed, double fuelConsumption, String comfortClass) {
        super(brand, model, price, maxiSpeed, fuelConsumption);
        this.comfortClass = comfortClass;
    }

    public String toString() {
        return "Sedan " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + comfortClass;
    }

}
