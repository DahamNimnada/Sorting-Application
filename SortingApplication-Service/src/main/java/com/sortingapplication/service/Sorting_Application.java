package com.sortingapplication.service;

import com.sortingapplication.core.Sort_Algorithms;
import com.sortingapplication.core.Timer;

import java.util.Arrays;
import java.util.*;

public class Sorting_Application {
    public static void main(String[] args) {
        int amount;
        int inputs = 0;
        int leftAmount;
        int inputValue;

        System.out.println("-----------------How many numbers would you like to sort ?-----------------");
        Scanner arrayAmount = new Scanner(System.in);
        amount = arrayAmount.nextInt();
        leftAmount = amount;
        int [] numbers = new int[amount];

        while (amount > 0) {
            Scanner inputNumber = new Scanner(System.in);
            System.out.println("-----------------Enter input "+(inputs+1)+" out of "+ leftAmount+"-----------------");
            inputValue = inputNumber.nextInt();
            numbers[inputs] = inputValue;
            amount--;
            inputs++;
        }

        Timer.setStartTime();
        System.out.println("-----------------Bubble-Sort Method-----------------");
        System.out.println(Arrays.toString(Sort_Algorithms.bubbleSort(numbers)));
        Timer.setEndTime();
        Timer.totalTime();
        System.out.println("----------------------------------------------------\n");

        Timer.setStartTime();
        System.out.println("-----------------Selection-Sort Method-----------------");
        System.out.println(Arrays.toString(Sort_Algorithms.selectionSort(numbers)));
        Timer.setEndTime();
        Timer.totalTime();
        System.out.println("-------------------------------------------------------\n");

        Timer.setStartTime();
        System.out.println("-----------------Insertion-Sort Method-----------------");
        System.out.println(Arrays.toString(Sort_Algorithms.insertionSort(numbers)));
        Timer.setEndTime();
        Timer.totalTime();
        System.out.println("-------------------------------------------------------");
    }
}
