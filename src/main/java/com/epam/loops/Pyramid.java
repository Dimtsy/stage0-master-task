package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            for (int k = 1; k <= cathetusLength - i; k++) {
                System.out.print(" ");
            }
            for (int j = cathetusLength - i + 1; j < cathetusLength + i; j++) {
                if (j == cathetusLength) {
                    System.out.print(1);
                }
                if (j < cathetusLength) {
                    System.out.print(cathetusLength - j + 1);
                }
                if (j > cathetusLength) {
                    System.out.print(j - cathetusLength + 1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
