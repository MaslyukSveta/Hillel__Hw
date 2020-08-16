package com.hillel.hw.hw9.taxPark.carPark;

import com.hillel.hw.hw9.taxPark.vehicle.Car;

public interface CarPark {

    Car[] speed(int max, int min);

    double fleetCost();

    Car[] sortCars();

    String toString(Car[] speed);


}
