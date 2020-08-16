package com.hillel.hw.hw9.taxPark.carPark;

import com.hillel.hw.hw9.taxPark.vehicle.Car;


public class CarPark3040 {

    private final Car[] cars;

    public CarPark3040(Car... countedCars) {
        cars = countedCars;
    }

    public int fleetCost() {

        int fleetCost = 0;

        for (Car car : cars) {
            fleetCost += car.getPrice();
        }
        return fleetCost;
    }

    public Car[] fuelSorting() {

        Car[] sorting = cars;

        for (int i = 0; i < sorting.length; i++) {
            double minConsumption = sorting[i].getFuelConsumption();
            Car minConsumptionCar = sorting[i];
            int minId = i;
            for (int j = i + 1; j < sorting.length; j++) {
                if (sorting[j].getFuelConsumption() < minConsumption) {
                    minConsumptionCar = sorting[j];
                    minId = j;
                }
            }

            Car temp = sorting[i];
            sorting[i] = minConsumptionCar;
            sorting[minId] = temp;
        }
        return sorting;
    }

    public Car[] speed(int min, int max) {

        Car[] modified = new Car[0];

        for (Car car : cars) {
            if (car.getMaxSpeed() >= min & car.getMaxSpeed() <= max) {
                modified = array(modified, car);
            }

        }
        return modified;

    }

    private Car[] array(Car[] initial, Car added) {
        Car[] modified = new Car[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;
    }

    public String toString(Car[] speedCars) {
        String report = "";
        for (Car car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }

}
