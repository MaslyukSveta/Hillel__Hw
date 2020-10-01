package com.hillel.hw.hw16.vehicle;

public class Jeep implements Car {

    private String brand;
    private String model;
    private int price;
    private int maxSpeed;
    private double fuelConsumption;

    private double clearance;

    public Jeep(String brand, String model, int price, int maxSpeed, double fuelConsumption, double clearance) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return "Jeep " + "Brand " + getBrand() +
                ", model " + getModel() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + clearance;
    }

    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    @Override
    public String getModel() {
        return model;
    }

}
