package com.hillel.hw.hw14.function;

import com.hillel.hw.hw14.vehicle.Car;

public class Comparator  {
    public static int compare(Car car1, Car car2) {
        return Double.compare(car1.getFuelConsumption(), car2.getFuelConsumption());
    }
}
