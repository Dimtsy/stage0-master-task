package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arrayNumber = new int[length];
        for (int i = 0; i < length; i++) {
            arrayNumber[i] = i + 1;
        }
        return arrayNumber;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reverseArray = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray[j] = arr[i];
            j++;
        }
        return reverseArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int arrayPositiveLength = 0;
        for (int number : arr) {
            if (number > 0) {
                arrayPositiveLength++;
            }
        }
        int[] arrayPositive = new int[arrayPositiveLength];
        int i = 0;
        for (int number : arr) {
            if (number > 0) {
                arrayPositive[i] = number;
                i++;
            }
        }
        return arrayPositive;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
//        Bubble Sort
        for (int i = 0; i < arr.length; i++) {
            boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[i][j] < arr[i][j - 1]) {
                        int value = arr[i][j];
                        arr[i][j] = arr[i][j - 1];
                        arr[i][j - 1] = value;
                        needIteration = true;
                    }

                }
            }
        }
//        Insertion Sort
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i].length;
            int[] arr2 = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < arr[j].length) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = arr2;
        }
        return arr;
    }
}
