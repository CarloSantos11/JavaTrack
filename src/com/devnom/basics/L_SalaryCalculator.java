package com.devnom.basics;

// If a person works for less than or equal to 8 hours
//      FORMULA: number of hours * 10
// If the person works for more than 8 hours but less than 12 hours
//      FORMULA: 20% for additonal hours + days pay
// If the person works for more than 12 hours
//      FORMULA: Additional days salary is credited.

public class L_SalaryCalculator {
    public static void main(String[] args) {
        double workingHours = 9;
        double salary = 0;
        double extraHours;

        if (workingHours <= 8){
            salary = workingHours * 10;
        } else if (workingHours > 8 || workingHours < 12){
            extraHours = workingHours - 8;
            salary = extraHours * 12 + 80;
        } else if (workingHours > 12) {
            salary = 160;
        }
        System.out.println(salary);
    }
}
