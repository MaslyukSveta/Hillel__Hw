package com.hillel.hw.hw9.flowers.exception;

public class InvalidStemLengthException extends Exception {
    private int minLength;
    private int maxLength;

    public InvalidStemLengthException(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }
    @Override
    public String toString() {
        return "The argument cannot be negative: " + minLength + " " + maxLength;
    }
    public int getStemMinLength() {
        return minLength;
    }

    public void setStemMinLength(int stemMinLength) {
        this.minLength = minLength;
    }

    public int getStemMaxLength() {
        return maxLength;
    }

    public void setStemMaxLength(int stemMaxLength) {
        this.maxLength = maxLength;
    }

}
