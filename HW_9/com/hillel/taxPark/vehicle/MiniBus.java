package com.hillel.taxPark.vehicle;

public class MiniBus implements Car {

    private String brand;
    private String model;
    private int price;
    private int maxSpeed;
    private double fuelConsumption;

    private int numberOfSeats;

    public MiniBus(String brand, String model, int price, int maxSpeed, double fuelConsumption, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Mini bus " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + numberOfSeats;
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
        return null;
    }

}
