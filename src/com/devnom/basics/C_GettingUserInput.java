package com.devnom.basics;

import java.io.IOException;

public class C_GettingUserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Print your first byte");
        int inByte = System.in.read(); // This allows us to grab a single character
        System.out.println("The first byte that you typed: " + (char)inByte);
        System.out.printf("%s: %c.%n", "The first byte that you typed", inByte);
    }
}
