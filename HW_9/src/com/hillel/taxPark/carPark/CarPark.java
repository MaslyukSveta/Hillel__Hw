package com.hillel.taxPark.carPark;

import com.hillel.taxPark.vehicle.Car;

public interface CarPark {

    Car[] speed(int max, int min);

    double fleetCost();

    Car[] sortCars();

    String toString(Car[] speed);


}
