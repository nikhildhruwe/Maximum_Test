package com.bridgelabz.maximum.utility;

import java.util.Arrays;

public class Maximum<T extends Comparable> {

    private T[] arguments;

    public Maximum(T... arguments) {
        this.arguments = arguments;
    }

    public T maximumValue() {
        return Maximum.maximumValue(arguments);
    }

    public static <T extends Comparable> T maximumValue(T... arguments) {
        T maxValue;
        Arrays.sort(arguments);
        maxValue = arguments[arguments.length - 1];
        printMax(maxValue);
        return maxValue;
    }

    public static <T> void printMax(T maxValue) {
        System.out.println("Maximum Value: " + maxValue);
    }
}
