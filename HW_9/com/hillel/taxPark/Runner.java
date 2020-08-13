package com.hillel.taxPark;

import com.hillel.taxPark.carPark.CarPark3040;
import com.hillel.taxPark.vehicle.Jeep;
import com.hillel.taxPark.vehicle.MiniBus;
import com.hillel.taxPark.vehicle.Sedan;

public class Runner {
    public static void main(String[] args) {

        Jeep car1 = new Jeep("Mazda", "CX-5", 25000, 220, 9.6, 15.6);
        Jeep car2 = new Jeep("BMW", "X1", 24000, 235, 8.9, 15.3);
        Jeep car3 = new Jeep("BMW", "X1", 23700, 235, 9.1, 15.3);
        Sedan car4 = new Sedan("Audi", "A8", 120000, 235, 7.8, "F");
        Jeep car5 = new Jeep("Nissan", "Juke", 17800, 215, 7.6, 16.5);
        Jeep car6 = new Jeep("Mazda", "CX-5", 19000, 215, 9.6, 15.6);
        Jeep car7 = new Jeep("Volkswagen", "Tiguan", 17200, 230, 9.9, 16.4);
        Jeep car8 = new Jeep("Mazda", "CX-3", 25600, 215, 8.2, 15.1);
        Sedan car9 = new Sedan("Audi", "A6", 22950, 235, 8.6, "E");
        Sedan car11 = new Sedan("Mazda", "6", 22500, 207, 8.4, "D");
        MiniBus car12 = new MiniBus("Ford", "Transit", 46595, 175, 9.0, 14);

        CarPark3040 proc = new CarPark3040(car1, car2, car3, car4, car5, car6, car7, car8, car9, car11, car12);

        int min = 200;
        int max = 230;

        System.out.println("Cars with max speed between " + min + " km/h and " + max + " km/h.");
        System.out.println(proc.toString(proc.speed(min, max)));

        System.out.println("Sorted cars by increasing of fuel consumption:");
        System.out.println(proc.toString(proc.fuelSorting()));

        System.out.println();

    }
}
