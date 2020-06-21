package com.bridgelabz.maximum.utility.Maximum;

public class Maximum {

    public Maximum() {

    }

    public int maximumValue(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        Integer maxValue=firstNumber;
        if (secondNumber.compareTo(maxValue)>0)
            maxValue=secondNumber;
        if (thirdNumber.compareTo(maxValue)>=0)
            maxValue=thirdNumber;
        return maxValue;
    }

    public float maximumValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxValue=firstNumber;
        if (secondNumber.compareTo(maxValue)>0)
            maxValue=secondNumber;
        if (thirdNumber.compareTo(maxValue)>=0)
            maxValue=thirdNumber;
        return maxValue;
    }
}
