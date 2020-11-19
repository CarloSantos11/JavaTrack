package com.snapIT.b_methods.dotComGame.inClassVersion;

import java.util.Scanner;

// recreate test code version
public class SimpleDotComTester {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int userGuess;
        String result = "";
        int guessCount = 0;

        int [] locations = {2,3,4};
        dot.setLocationCells(locations);

        Scanner input = new Scanner(System.in);
        System.out.println("Hello User");
        System.out.println("Enter an integer to sink the ship");
        userGuess = input.nextInt();
        guessCount++;

        while (true) {
            result = dot.checkYourself(userGuess);

            if( result == "kill")
                break;
            System.out.println("Enter an integer to sink the ship");
            userGuess = input.nextInt();
            guessCount++;
        }

        System.out.println("You took " + guessCount + " guesses");
    }
}
