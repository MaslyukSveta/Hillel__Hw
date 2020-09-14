package com.hillel.hw.hw14.runner;


import com.hillel.hw.hw14.carPark.CarPark3040;
import com.hillel.hw.hw14.vehicle.Car;
import com.hillel.hw.hw14.vehicle.Jeep;
import com.hillel.hw.hw14.vehicle.MiniBus;
import com.hillel.hw.hw14.vehicle.Sedan;

public class Runner {
    public static void main(String[] args) {

    Car[] cars = {
            new Jeep("Mazda", "CX-5", 25000, 220, 9.6, 15.6),
            new Jeep("BMW", "X1", 24000, 235, 8.9, 15.3),
            new Jeep("BMW", "X1", 23700, 235, 9.1, 15.3),
            new Sedan("Audi", "A8", 120000, 235, 7.8, "F"),
            new Jeep("Nissan", "Juke", 17800, 215, 7.6, 16.5),
            new Jeep("Mazda", "CX-5", 19000, 215, 9.6, 15.6),
            new Jeep("Volkswagen", "Tiguan", 17200, 230, 9.9, 16.4),
            new Jeep("Mazda", "CX-3", 25600, 215, 8.2, 15.1),
            new Sedan("Audi", "A6", 22950, 235, 8.6, "E"),
            new Sedan("Mazda", "6", 22500, 207, 8.4, "D"),
            new MiniBus("Ford", "Transit", 46595, 175, 9.0, 14)
        };
        CarPark3040 carPark3040 = new CarPark3040(cars);
        carPark3040.sortByConsumptionReference();
        carPark3040.sortByFuelConsumption();
        carPark3040.sortByFuelConsumptionLambda();
    }

}
