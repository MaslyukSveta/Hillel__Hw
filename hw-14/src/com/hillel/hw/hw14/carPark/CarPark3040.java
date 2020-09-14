package com.hillel.hw.hw14.carPark;

import com.hillel.hw.hw14.vehicle.Car;

import java.util.Arrays;
import java.util.Comparator;


public class CarPark3040 {

    private  Car[] cars;

    public CarPark3040 (Car [] cars){
        this.cars = cars;
    }
    public int fleetCost() {

        int fleetCost = 0;

        for (Car car : cars) {
            fleetCost += car.getPrice();
        }
        return fleetCost;
    }

    public void sortByFuelConsumption() {
        Arrays.sort(cars, new Comparator<Car>() {
            public int compare(Car car1, Car car2) {
                return Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption());
            }
        });
    }

    public void sortByFuelConsumptionLambda() {
        Arrays.sort(cars,
                (Comparator<Car>) (car1, car2) -> Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption()));
    }
    public void sortByConsumptionReference() {

        Arrays.sort(cars,Comparator::compare );
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
    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

}
