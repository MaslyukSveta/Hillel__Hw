package com.hillel.hw.hw15.taxPark.carPark;


import com.hillel.hw.hw15.taxPark.vehicle.Car;

import java.util.ArrayList;

public interface CarPark {
    int fleetCost();
    ArrayList<Car> searchBySpeed(double min, double max);
    void sortByFuelConsumption();
    void sortByFuelConsumptionWithReference();
    void sortByFuelConsumptionWithLambda();

}
