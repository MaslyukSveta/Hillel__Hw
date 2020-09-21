package com.hillel.hw.hw15.taxPark.function;


import com.hillel.hw.hw15.taxPark.vehicle.Car;

import java.util.Comparator;

public class ComparatorFuelConsumption<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        return Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption());
    }
}
