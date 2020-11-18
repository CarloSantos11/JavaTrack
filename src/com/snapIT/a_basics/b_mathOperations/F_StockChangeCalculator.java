package com.snapIT.a_basics.b_mathOperations;

// Users expect to see the daily percentage of increase or decrease of financial
// instruments such as stocks and foreign currency. We will ask the user for the stock
// the percent change and print in a nicely formatted way. To achieve this, perform the following steps.

import java.util.Scanner;

// 1. Create a new class and enter StockChangeCalculator
// 2. Import java.util.Scanner package:
// 3. In the main() use System.out.print to ask the user for the symbol of the stock,
// followed by the day1 and day2 values of the stock.



// Description:
// This program finds the percent of change between
// day one's stock value vs. day two's stock value
public class F_StockChangeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day one value");
        double numberOne = input.nextDouble();
        System.out.println("Enter day two value");
        double numberTwo = input.nextDouble();

                                 //This formula finds percent of change
        double percentOfChange = (numberTwo - numberOne) * (numberOne / 100);
        System.out.printf("%.2f",percentOfChange);
    }
}









