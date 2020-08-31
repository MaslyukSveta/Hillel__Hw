package com.hillel.hw.hw12.taxPark.Runner;
import com.hillel.hw.hw12.taxPark.carPark.FileWorker;
import com.hillel.hw.hw12.taxPark.vehicle.Car;

public class Runner {
    public static void main(String[] args) {
        FileWorker fileWorker = new FileWorker("E:\\\\InitialFile.txt", "E:\\\\FinalFile.txt");
        Car[] cars = fileWorker.readFile();
        fileWorker.writeFile(cars);

    }
}