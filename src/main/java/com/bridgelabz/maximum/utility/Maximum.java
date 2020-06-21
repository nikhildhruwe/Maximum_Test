package com.bridgelabz.maximum.utility;

import java.util.Arrays;

public class Maximum <T extends Comparable > {

    private T[] arguments;
    T[] array;

    public Maximum(T... arguments) {
        this.arguments = arguments;
    }

    public T maximumValue() {
        return Maximum.maximumValue(arguments);
    }

    public static <T extends Comparable> T maximumValue(T... arguments) {
        T maxValue;
        int length;
        Arrays.sort(arguments);
        length = arguments.length;
        maxValue = arguments[length - 1];
        return maxValue;
    }
}
