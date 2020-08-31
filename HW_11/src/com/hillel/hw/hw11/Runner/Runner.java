package com.hillel.hw.hw11.Runner;

import com.hillel.hw.hw11.processor.Container;
import com.hillel.hw.hw11.thread.PrimeThread;
import com.hillel.hw.hw11.utils.ArrayUtils;

import java.util.Scanner;

public class Runner {

    Scanner scanner;
    Container container;

    public Runner(Container container) {
        this.scanner = new Scanner(System.in);
        this.container = container;
    }
    public static void main(String[] args) {
        Container container = new Container();
        Runner runner = new Runner(container);
        runner.start();
        runner.stop();
    }
    private int[] makeArray(int first, int last) {

        int[] result = new int[0];
        for (int counter = first; counter <= last; counter++) {
            result = ArrayUtils.modifyArray(result, counter);
        }

        return result;
    }

    private void start() {
        System.out.println("Enter numbers of threads: ");
        int numberOfThreads = scanner.nextInt();
        System.out.println("Enter start of range: ");
        int initial = scanner.nextInt();
        System.out.println("Enter end of range: ");
        int last = scanner.nextInt();

        if (numberOfThreads > 1) {
            countBySeveralThreads(numberOfThreads, initial, last);
        } else countByOneThread(numberOfThreads,initial, last);

        System.out.println(container);

    }
    private void countBySeveralThreads(int numberOfThreads, int initial, int last) {
        int subarraySize = ((last - initial) / numberOfThreads + 1);
        int lastSubarraySize = last - initial - subarraySize * (numberOfThreads - 1) + 1;


        for (int i = 0; i < numberOfThreads; i++) {
            int first = i * subarraySize + initial;
            int i1;
            if (i == numberOfThreads - 1) {
                i1 = last;
            } else {
                i1 = last - lastSubarraySize - subarraySize * (numberOfThreads - i - 2);
            }

            PrimeThread thread = new PrimeThread(makeArray(first, i1));
            Thread newThread = new Thread(thread);
            newThread.start();

            try {
                newThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void countByOneThread(int numberOfThreads, int minNumber, int maxNumber) {
        PrimeThread[] myThreads = new PrimeThread[numberOfThreads];
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            myThreads[i] = new PrimeThread(container, maxNumber, minNumber);
            myThreads[i].getThread().start();
        }
        for (int i = 0; i <= numberOfThreads - 1; i++) {
            try {
                myThreads[i].getThread().join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private void stop() {

    }

}
