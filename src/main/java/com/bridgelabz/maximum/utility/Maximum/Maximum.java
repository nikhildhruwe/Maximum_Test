package com.bridgelabz.maximum.utility.Maximum;

public class Maximum <T extends Comparable >{

    private T firstMember;
    private T secondMember;
    private T thirdMember;

    public Maximum(T firstMember, T secondMember, T thirdMember) {
        this.firstMember=firstMember;
        this.secondMember=secondMember;
        this.thirdMember=thirdMember;
    }

    public T maximumValue() {
      return   Maximum.maximumValue(firstMember,secondMember,thirdMember);
    }

    public static <T extends Comparable> T maximumValue(T firstMember, T secondMember, T thirdMember) {
        T maxValue=firstMember;
        if (secondMember.compareTo(maxValue)>0)
            maxValue=secondMember;
        if (thirdMember.compareTo(maxValue)>=0)
            maxValue=thirdMember;
        return maxValue;
    }

}
