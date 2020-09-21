package com.hillel.hw.hw15.taxPark.vehicle;

public class Car {

    private String brand;
    private String model;
    private int price;
    private int maxSpeed;
    private double fuelConsumption;

    public Car(String brand, String model, int price, int maxSpeed, double fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;

    }


    public String getBrand() {
        return brand;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "Jeep " + "Brand " + getBrand() +
                ", model " + getModel() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption();
    }

}
