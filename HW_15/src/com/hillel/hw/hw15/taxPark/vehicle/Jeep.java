package com.hillel.hw.hw15.taxPark.vehicle;

public class Jeep extends Car {

    private double clearance;

    public Jeep(String brand, String model, int price, int maxiSpeed, double fuelConsumption, double clearance) {
        super(brand, model, price, maxiSpeed, fuelConsumption);
        this.clearance = clearance;
    }
    @Override
    public String toString() {
        return "Jeep " + "Brand " + getBrand() +
                ", model " + getModel() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption();
    }


}
