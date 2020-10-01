package com.hillel.hw.hw16.function;

import com.hillel.hw.hw16.vehicle.Car;

import java.util.Comparator;



public class ComparatorPark<T extends Car> implements Comparator<T> {

    @Override
    public  int compare(T car1, T car2) {
        return Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption());

    }
}