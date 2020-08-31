package com.hillel.hw.hw12.taxPark.carPark;


import com.hillel.hw.hw12.taxPark.vehicle.Car;

public interface CarPark {

    Car[] speed(int max, int min);

    double fleetCost();

    Car[] fuelSorting();

    String toString(Car[] speed);


}
