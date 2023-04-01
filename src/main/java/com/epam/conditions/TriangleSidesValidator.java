package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        String valid = "it's not a triangle";
        if (firstSide + secondSide > thirdSide) {
            if (thirdSide + secondSide > firstSide) {
                if (firstSide + thirdSide > secondSide) {
                    valid = "this is a valid triangle";
                }
            }
        }
        System.out.println(valid);
    }
}
