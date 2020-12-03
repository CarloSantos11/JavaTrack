package com.snapIT.morningChallenges.week2;

public class FizzBuzz {
    public static void main(String[] args) {
         // print all numbers between 0 - 100
         // if the number is evenly divisble by 3 print fizz
        // if the number is evenly divisble by 5 print buzz
        // if the number is evenly divisble by 3 & 5 print fizz buzz


        for (int i = 1; i < 101; i++) {
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("Fizz Buzz");
            } else if ( i % 5 == 0) {
               System.out.println( "buzz");
           } else if( i % 3 == 0) {
                System.out.println("fizz");
            } else System.out.println(i);
        }
    }
}
