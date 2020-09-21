package com.hillel.hw.hw15.taxPark.vehicle;

public class MiniBus extends Car{

    private int numberOfSeats;

    public MiniBus(String brand, String model, int price, int maxiSpeed, double fuelConsumption, int numberOfSeats) {
        super(brand, model, price, maxiSpeed, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
    }


    public String toString() {
        return "Mini bus " + "Brand " + getBrand() +
                ", maximum speed " + getMaxSpeed() +
                " km/h, price " + getPrice() +
                " $, fuel consumption " + getFuelConsumption() +
                " l/100km, " + numberOfSeats;
    }


}
