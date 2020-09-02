package com.hillel.hw.hw12.taxPark.Runner;

import com.hillel.hw.hw12.taxPark.carPark.CarPark;
import com.hillel.hw.hw12.taxPark.carPark.CarPark3040;
import com.hillel.hw.hw12.taxPark.processor.Reader;
import com.hillel.hw.hw12.taxPark.processor.Writer;
import com.hillel.hw.hw12.taxPark.vehicle.Car;

import java.io.File;
import java.io.IOException;

public class Runner {

    public static void main(String[] args) {
        Reader incomingData = new Reader(new File("inputcars.txt"));
        Car[] cars = null;
        try {
            cars = incomingData.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CarPark park = (CarPark) new CarPark3040(cars);

        Writer doutgoingData = new Writer(park.getCars());
        try {
            doutgoingData.write();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}