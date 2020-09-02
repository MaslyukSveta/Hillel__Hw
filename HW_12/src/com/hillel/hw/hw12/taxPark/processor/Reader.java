package com.hillel.hw.hw12.taxPark.processor;

import com.hillel.hw.hw12.taxPark.vehicle.Car;
import com.hillel.hw.hw12.taxPark.vehicle.Jeep;
import com.hillel.hw.hw12.taxPark.vehicle.MiniBus;
import com.hillel.hw.hw12.taxPark.vehicle.Sedan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    private static final String JEEP_CLASS_IDENTIFIER = "JEEP";
    private static final String MINI_BUS_CLASS_IDENTIFIER = "MiniBas";
    private static final String SEDAN_CLASS_IDENTIFIER = "Sedan";
    private static final String CAR_LINE_DELIMETER = ";\r\n";
    private static final String CAR_PROPERTIES_DELIMETER = ",";
    private File sourceFile;

    public Reader(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public Car[] read() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        byte[] fileBytes = new byte[fileInputStream.available()];
        fileBytes = fileInputStream.readAllBytes();
        String fileContent = new String(fileBytes);
        String[] carLines = fileContent.split(CAR_LINE_DELIMETER);
        return Cars(carLines);
    }

    public Car[] Cars(String[] carLines) {
        Car[] cars = new Car[carLines.length];
        for (int i = 0; i < carLines.length; i++) {
            String[] carProperties = carLines[i].split(CAR_PROPERTIES_DELIMETER);
            switch (carProperties[0]) {
                case SEDAN_CLASS_IDENTIFIER:
                    cars[i] = new Sedan(carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), carProperties[6]);
                    break;
                case MINI_BUS_CLASS_IDENTIFIER:
                    cars[i] = new MiniBus(carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), Integer.parseInt(carProperties[6]));
                    break;
                case JEEP_CLASS_IDENTIFIER:
                    cars[i] = new Jeep(carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), Double.parseDouble(carProperties[6]));
                    break;
            }
        }
        return cars;
    }
}
