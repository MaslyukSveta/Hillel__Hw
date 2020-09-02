package com.hillel.hw.hw12.taxPark.vehicle;

public class Sedan implements Car {

    private String brand;
    private String model;
    private int price;
    private int maxSpeed;
    private double fuelConsumption;
    private String comfortClass;



    public Sedan(String brand, String model, int price, int maxSpeed, double fuelConsumption, String comfortClass) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.comfortClass = comfortClass;
    }


    @Override
    public String toString() {
        return "Brand " + getBrand() +
                "," + getModel() +
                "," + getMaxSpeed() +
                "," + getPrice() +
                "," + getFuelConsumption() +
                "," + comfortClass;
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
