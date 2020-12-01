package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.calculator;

import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator.Division;
import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator.Multiplication;
import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator.Operator;
import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.calculator.Subtraction;

public class Operators {
    public static final Operator DEFAULT_OPERATOR = new Operator();

    public static final Operator[] OPERATORS = new Operator[]{
            new Division(),
            new Multiplication(),
            DEFAULT_OPERATOR,
            new Subtraction(),
    };

    public static Operator findOperator(String operator) {
        for(Operator possible : OPERATORS) {
            if(possible.matches(operator)) {
                return possible;
            }
        }
        return DEFAULT_OPERATOR;
    }
}
