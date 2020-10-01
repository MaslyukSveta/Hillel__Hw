package com.hillel.hw.hw16.carPark;

import com.hillel.hw.hw16.function.ComparatorPark;
import com.hillel.hw.hw16.vehicle.Car;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class CarPark3040 implements CarPark <Car> {

    private ArrayList<Car> cars;

    public CarPark3040(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public double fleetCost() {
        return cars.stream().mapToDouble(Car::getPrice).reduce(0, (a, b) -> a + b);
    }

    @Override
    public ArrayList<Car> speed(double min, double max) {
        return (ArrayList<Car>) cars.stream().filter(a -> a.getMaxSpeed() > min && a.getMaxSpeed() < max).collect(Collectors.toList());
    }

    @Override
    public void sort() {
        cars  = (ArrayList<Car>) cars.stream().sorted(new ComparatorPark<>()).collect(Collectors.toList());

    }

    @Override
    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars.addAll(cars);
    }
    @Override
    public String toString(ArrayList<Car> speedCars) {
        String report = "";
        for (Car car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }

}
