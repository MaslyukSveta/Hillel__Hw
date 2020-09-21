package com.hillel.hw.hw15.taxPark.carPark;


import com.hillel.hw.hw15.taxPark.function.ComparatorFuelConsumption;
import com.hillel.hw.hw15.taxPark.vehicle.Car;

import java.util.ArrayList;
import java.util.Comparator;

public class CarPark3040 implements CarPark {

    private ArrayList<Car> carArrayList;

    public CarPark3040(Car... countedCars) {
        carArrayList = new ArrayList<>();
        for (Car car : countedCars) {
            carArrayList.add(car);
        }
    }
    public int fleetCost() {

        int fleetCost = 0;

        for (Car car : carArrayList) {
            fleetCost += car.getPrice();
        }
        return fleetCost;
    }
    public ArrayList<Car> searchBySpeed(double min, double max) {
        ArrayList<Car> foundCars = new ArrayList<>();
        for (Car car : carArrayList) {
            if (car.getMaxSpeed() > min && car.getMaxSpeed() < max)
                foundCars.add(car);
        }
        return foundCars;
    }

    public void sortByFuelConsumption() {
       carArrayList.sort(new Comparator<Car>() {
           @Override
           public int compare(Car o1, Car o2) {
               return  Double.compare(o1.getFuelConsumption(), o2.getFuelConsumption());
           }
       });

    }

    public void sortByFuelConsumptionWithReference() {
        ComparatorFuelConsumption<Car> consumptionComparator = new ComparatorFuelConsumption<>();
        carArrayList.sort(consumptionComparator::compare);
    }

    public void sortByFuelConsumptionWithLambda() {
        carArrayList.sort((Comparator<Car>) (car1, car2) -> Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption()));
    }
    public ArrayList<Car> getCars() {
        return carArrayList;
    }
    public String toString(ArrayList<Car> speedCars) {

        String report = "";
        for (Car car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }
/*
    public String toString( ArrayList<Car> searchBySpeed) {
        StringJoiner sj = new StringJoiner(",\n");
        for (Car car : searchBySpeed) {
            Car.add(car.toString());
        }
        return sj.toString();
    }
*/
}
