package com.hillel.hw.hw12.taxPark.processor;

import com.hillel.hw.hw12.taxPark.vehicle.Car;
import com.hillel.hw.hw12.taxPark.vehicle.Jeep;
import com.hillel.hw.hw12.taxPark.vehicle.MiniBus;
import com.hillel.hw.hw12.taxPark.vehicle.Sedan;

import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {

    private Car[] carsToWrite;

    public Writer(Car[] carsToWrite) {
        this.carsToWrite = carsToWrite;
    }

    public void write() throws IOException {
        FileOutputStream fout = new FileOutputStream("outputcars.txt");
        fout.write(makeStringCars().getBytes());
        fout.close();
    }

    private String makeStringCars() {
        String carString = "";
        for (int i = 0; i < carsToWrite.length; i++) {
            switch (carsToWrite[i].getClass().getSimpleName()) {
                case "Sedan":
                    Sedan sTemp;
                    sTemp = (Sedan) carsToWrite[i];
                    carString += "Sedan," + sTemp.toString();
                    break;
                case "MiniBus":
                    MiniBus mTemp;
                    mTemp = (MiniBus) carsToWrite[i];
                    carString += "MiniBus," + mTemp.toString();
                    break;

                case "Jeep":
                    Jeep tTemp;
                    tTemp = (Jeep) carsToWrite[i];
                    carString += "Jeep," + tTemp.toString();
                    break;
            }
            if (i != (carsToWrite.length - 1)) {
                carString += ";\r\n";
            }
        }
        return carString;
    }

}
