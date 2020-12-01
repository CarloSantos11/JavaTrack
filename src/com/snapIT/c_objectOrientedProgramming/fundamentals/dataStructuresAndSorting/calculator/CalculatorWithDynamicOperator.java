package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.calculator;

import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator.Operator;

public class CalculatorWithDynamicOperator {
    private final double operand1;
    private final double operand2;

    // The Current operator
    private final Operator operator;

    public CalculatorWithDynamicOperator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = Operators.findOperator(operator);
    }

    public double operate() {
        return operator.operate(operand1, operand2);
    }

    public static void main(String[] args) {
        System.out.println("1 + 1 = " + new CalculatorWithDynamicOperator(1,1,"+").operate());
        System.out.println("5 - 1 = " + new CalculatorWithDynamicOperator(5,1,"-").operate());
        System.out.println("123 / 7 = " + new CalculatorWithDynamicOperator(123,7,"/").operate());
        System.out.println("4 * 8 = " + new CalculatorWithDynamicOperator(4,8,"*").operate());
    }
}

