package com.bridgelabz.maximum.utility.Maximum;

public class Maximum {

    public static <T extends Comparable> T maximumValue(T firstMember, T secondMember, T thirdMember) {
        T maxValue=firstMember;
        if (secondMember.compareTo(maxValue)>0)
            maxValue=secondMember;
        if (thirdMember.compareTo(maxValue)>=0)
            maxValue=thirdMember;
        return maxValue;
    }

}
