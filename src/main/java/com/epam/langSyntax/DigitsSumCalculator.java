package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int b = 0;
        while (number > 0) {
            int a = number % 10;
            b += a;
            number = number / 10;
        }
        System.out.println(b);
    }
}
