package com.snapIT.morningChallenges.week2;

//1) Create a method called areaOfSquare(double side) that takes a length of a side as an argument.
//Have the method return the area of the square given the side.(google the formula if you do not know it.)

public class Day3 {
    public static void main(String[] args) {
//        double side = 5;
//        System.out.println(areaOfSquare(side));
//
//        double sideA = 5;
//        double sideB = 8;
//        System.out.println(hypotenuse(side,sideB));

        System.out.println(sleepIn(true, false)); // --> false
        System.out.println(sleepIn(false, false)); // --> true
        System.out.println(sleepIn(true, false) ); // --> false
        System.out.println(sleepIn(false, true)); // --> true
        System.out.println(sleepIn(true, true)); // --> true
    }

    public static double areaOfSquare(double sideParam) {
        return Math.pow(sideParam, 2);
    }

    public static double hypotenuse( double side1, double side2) {
        double hypotenuseSquared = Math.pow(side1, 2) + Math.pow(side2,2);
        return Math.sqrt(hypotenuseSquared);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        // Weekday is true if it is in the work week
        // Weekday is false if it is the week end

        // Vacation is true if we are on vacation
        // Vacation is false if we are stuck at home
        if(weekday == false || vacation == true){
            return true;
        } else
            return false;

    }
}
