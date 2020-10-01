package com.hillel.hw.hw16.carPark;

import com.hillel.hw.hw16.vehicle.Car;

import java.util.ArrayList;

public interface CarPark <T extends Car> {

    double fleetCost();
    ArrayList<Car> speed(double min, double max);
    void sort();
    ArrayList<Car> getCars();
    void setCars(ArrayList<Car> cars);
    String toString(ArrayList<Car> spendCars);

}


