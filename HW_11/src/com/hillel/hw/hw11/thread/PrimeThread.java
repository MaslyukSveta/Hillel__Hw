package com.hillel.hw.hw11.thread;

import com.hillel.hw.hw11.processor.Container;
import com.hillel.hw.hw11.utils.ArrayUtils;

public class PrimeThread implements Runnable {

    private int[] numbers;
    private int initial;
    private int last;
    private Container container;
    private Thread thread;


    public PrimeThread(Container container, int last, int initial) {

        this.numbers = new int[0];
        this.initial = initial;
        this.last = last;
        this.container = container;
        thread = new Thread(this);

    }




    @Override
    public void run() {
        int count = 0;
        for (int i = initial; i < last; i++) {
            if (isPrime(i)) {
                numbers = ArrayUtils.increaseArray(numbers);
                numbers[count] = i;
                count++;
            }
        }
        container.fillContainer(numbers, count);
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public int[] getNumbers() { return numbers; }
    public void setNumbers(int[] numbers) { this.numbers = numbers; }

    public Container getContainer() { return container; }
    public void setContainer(Container container) { this.container = container; }

    public int getInitial() { return initial; }
    public void setInitial(int initial) { this.initial = initial; }

    public int getLast() { return last; }
    public void setLast(int last) { this.last = last; }

    public Thread getThread() { return thread; }
    public void setThread(Thread thread) { this.thread = thread; }

}
