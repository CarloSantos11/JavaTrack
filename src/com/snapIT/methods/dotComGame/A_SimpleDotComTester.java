package com.snapIT.methods.dotComGame;

import com.snapIT.methods.dotComGame.A_SimpleDotCom;

import java.util.Scanner;

// recreate test code version
public class A_SimpleDotComTester {
    public static void main(String[] args) {
        A_SimpleDotCom dot = new A_SimpleDotCom();

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
