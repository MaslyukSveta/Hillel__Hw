package com.hillel.hw.hw16;


import com.hillel.hw.hw16.carPark.CarPark;
import com.hillel.hw.hw16.carPark.CarPark3040;
import com.hillel.hw.hw16.vehicle.Car;
import com.hillel.hw.hw16.vehicle.Jeep;
import com.hillel.hw.hw16.vehicle.MiniBus;
import com.hillel.hw.hw16.vehicle.Sedan;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Jeep("Mazda", "CX-5", 25000, 220, 9.6, 15.6));
        cars.add(new Jeep("BMW", "X1", 24000, 235, 8.9, 15.3));
        cars.add(new Sedan("BMW", "X1", 23700, 235, 9.1, "F"));
        cars.add(new Jeep("Audi", "A8", 120000, 235, 7.8, 16));
        cars.add(new Jeep("Nissan", "Juke", 17800, 215, 7.6, 16.5));
        cars.add(new Jeep("Mazda", "CX-5", 19000, 215, 9.6, 15.6));
        cars.add(new Jeep("Volkswagen", "Tiguan", 17200, 230, 9.9, 16.4));
        cars.add(new Jeep("Mazda", "CX-3", 25600, 215, 8.2, 15.1));
        cars.add(new Sedan("Audi", "A6", 22950, 235, 8.6, "E"));
        cars.add(new Sedan("Mazda", "6", 22500, 207, 8.4, "D"));
        cars.add(new MiniBus("Ford", "Transit", 46595, 175, 9.0, 14));

        CarPark carPark = new CarPark3040(cars);

        ArrayList<Car> searchedBySpeed = (ArrayList<Car>) carPark.speed(190, 210);
        System.out.println(searchedBySpeed);


        
    }
}
