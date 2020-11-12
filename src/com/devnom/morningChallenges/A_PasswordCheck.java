package com.devnom.morningChallenges;

import java.util.Scanner;

public class A_PasswordCheck {
    public static void main(String[] args) {
//        Ch 1
//         - Create a Java Application With a Class Called PassWordCheck
//        - This program should prompt the user for a password.
//        - We will create a password String variable with a value of "Secret Password"
//        - If the user guesses the password correctly congratulate the user for guessing the password.

        System.out.println("Please Enter A Password");
        Scanner input = new Scanner(System.in);
        String passWord = "Secret Password";
        String userInput = input.nextLine();
        if ( userInput.equals(passWord)) {
            System.out.println("Welcome to the club");
        } else {
            System.out.println("Try again");
        }
    }
}
