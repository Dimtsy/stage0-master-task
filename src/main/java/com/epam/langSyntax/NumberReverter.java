package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        while (number > 0) {
            int a = number % 10;
            System.out.print(a);
            number = number / 10;
        }
        System.out.println("");
    }
}
