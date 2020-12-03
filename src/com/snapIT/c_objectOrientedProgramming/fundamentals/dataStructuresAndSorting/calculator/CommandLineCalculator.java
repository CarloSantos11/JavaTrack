package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.calculator;

import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator.Operator;

import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printOptions();
            String option = scanner.next();

            if (option.equalsIgnoreCase("Q")){
                break;
            }

            System.out.println("Type the first operand: ");
            double operand1 = scanner.nextDouble();

            System.out.println("Type second operand: ");
            double operand2 = scanner.nextDouble();

            Operator operator = Operators.findOperator(option);
            double result = operator.operate(operand1, operand2);

            System.out.printf("%f %s %f = %f\n", operand1, operator.operator, operand2, result);
        }
    }

    private static void printOptions() {
        System.out.println("Q (or q) - To quit");
        System.out.println("An operator. If not supported, will use sum.");
        System.out.println("Type your option");
    }

}
