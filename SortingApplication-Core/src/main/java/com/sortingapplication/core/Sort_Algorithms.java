package com.sortingapplication.core;

public class Sort_Algorithms {

    public static int[] bubbleSort(int[] numbers) {
        int length = numbers.length;
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static int[] selectionSort (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int smallestNumber = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[smallestNumber] > numbers[j]) {
                    smallestNumber = j;
                }
            }
            int temp = numbers [smallestNumber];
            numbers[smallestNumber] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }

    public static int[] insertionSort (int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i-1;
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1] = current;
        }
        return numbers;
    }
}
