package com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator;

public class Calculator {
    double operand1;
    double operand2;
    String operator;

    public Calculator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double operate() {
        if(this.operator == "+") {
            return operand1 + operand2;     // imagine there was more than just this logic in here
        } else if(this.operator == "-") {   // We wouldn't want to stuff it inside this if statement
            return operand1 - operand2;
        } else if(this.operator == "*") {
            return operand1 * operand2;
        } else if(this.operator == "/") {
            return operand1 / operand2;
        } else return 0;
    }


    public static void main(String[] args) {
        Calculator myFirstCalculator = new Calculator(10,20, "/");
        Calculator mySecondCalculator = new Calculator(10,20, "*");
        Calculator myThirdCalculator = new Calculator(10,20, "+");
        Calculator myFourthCalculator = new Calculator(10,20, "-");

        System.out.println(myFirstCalculator.operate());
        System.out.println(mySecondCalculator.operate());
        System.out.println(myThirdCalculator.operate());
        System.out.println(myFourthCalculator.operate());
    }
}
