package com.snapIT.c_objectOrientedProgramming.fundamentals.calculator;

public class Subtraction extends Operator {
    public Subtraction() {
        super("-");
    }

    @Override
    public double operate(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
