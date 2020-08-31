package com.hillel.hw.hw11.processor;

import com.hillel.hw.hw11.utils.ArrayUtils;

import java.util.Arrays;

public class Container {

    private int[] container;

    public Container() {
        this.container = new int[0];
    }
/*
    public synchronized void addPrimes(int[] primesToAdd) {
        int previousArrayLength = this.container.length;
        container = Arrays.copyOf(container, previousArrayLength + primesToAdd.length);
        for (int number : primesToAdd) {
            container[previousArrayLength++] = number;
        }
    }

    public int[] getPrimes() {
        return container;
    }

    public void setPrimes(int[] primes) {
        this.container = primes;
    }
*/
    public synchronized void fillContainer(int[] array, int amountOfElements) {
        int count = container.length - amountOfElements;
        container = ArrayUtils.modifyArray(container, amountOfElements);
        System.arraycopy(array, 0, container, container.length - amountOfElements, amountOfElements);
    }

    @Override
    public String toString() {
        return Arrays.toString(container);
    }
}
