package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assignment
        // Write a program that takes a value from the user and
        // prints out that number's position in fibonacci sequence.
        // Fibonacci sequence is a series of numbers where the previous two numbers sum up
        // to make the next number.
        // In this case, take the first two numbers of the sequence to be 1, 1
        // e.g. 1, 1, 2, 3, 5, 8, ...
        // Enter the position you want: 4
        // 3

        // initialize the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 0;

        for (int i = 2; i < upperLimit; i++) {
            currentNumber = firstNumber + secondNumber; // get the value of the current number
            firstNumber = secondNumber; //
            secondNumber = currentNumber;
        }

       System.out.println("The number of the fibonacci sequence at position " + upperLimit + " is " + currentNumber);


    }

}