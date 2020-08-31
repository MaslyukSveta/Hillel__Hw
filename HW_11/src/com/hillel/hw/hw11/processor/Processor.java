/*package com.hillel.hw.hw11.processor;
import com.hillel.hw.hw11.thread.PrimeThread;

import java.util.Scanner;

public class Processor {

    private int initialNumber;
    private int lastNumber;
    private int numberOfThreads;
    private static int[] primes = new int[0];

    public Processor(int initial, int last, int threads) {
        this.initialNumber = initial;
        this.lastNumber = last;
        this.numberOfThreads = threads;
    }

    private void countBySeveralThreads(int numberOfThreads, int initial, int last) {
        int temp1 = initial;
        int temp2 = initial;
        int tempLast = last;
        int threads = (last - initial)/numberOfThreads;
        PrimeThread[] myThreads = new PrimeThread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            myThreads[i] = new PrimeThread(container, initial, last);
            myThreads[i].getThread().start();

            if (i == 0) {
                tempLast += threads;
            } else if (i == numberOfThreads - 1) {
                temp1 += threads;
                temp2 += last;
            } else {
                temp1 += threads;
                temp2 += threads;
            }

        }
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            try {
                myThreads[i].getThread().join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }


    }

    private void countByOneThread(int numberOfThreads, int initial, int last) {
        PrimeThread[] threads = new PrimeThread[numberOfThreads];
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            threads[i] = new PrimeThread(container, last, initial);
            threads[i].getThread().start();
        }
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            try {
                threads[i].getThread().join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }




    private void stop() {
        scanner.close();
    }
}
*/