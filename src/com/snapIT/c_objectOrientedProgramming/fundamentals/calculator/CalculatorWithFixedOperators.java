package com.snapIT.c_objectOrientedProgramming.fundamentals.calculator;

public class CalculatorWithFixedOperators {
    public static void main(String[] args) {
        System.out.println("1 + 1 = " + new CalculatorWithFixedOperators(1,1,"+").operate());
        System.out.println("4 - 2 = " + new CalculatorWithFixedOperators(4,2,"-").operate());
        System.out.println("1 x 2 = " + new CalculatorWithFixedOperators(1,2,"x").operate());
        System.out.println("10 / 2 = " + new CalculatorWithFixedOperators(10, 2, "/").operate());
    }

    private final double operand1;
    private final double operand2;

    // The Current Operator
    private final Operator operator;

    // All Possible Operations
    private final Division division = new Division();
    private final Multiplication multiplication = new Multiplication();
    private final Operator sum = new Operator();
    private final Subtraction subtraction = new Subtraction();

    public CalculatorWithFixedOperators(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;

        if (subtraction.matches(operator)) {
            this.operator = subtraction;
        } else if (multiplication.matches(operator)) {
            this.operator = multiplication;
        } else if (division.matches(operator)) {
            this.operator = division;
        } else {
            this.operator = sum;
        }
    }

    public double operate() {
        return operator.operate(operand1,operand2);
    }
}


// Refactor: it is rewriting your code after implementation with the intention of improving it for readability or
// efficiency/speed