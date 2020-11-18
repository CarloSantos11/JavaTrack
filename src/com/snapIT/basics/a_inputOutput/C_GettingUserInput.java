package com.snapIT.basics.a_inputOutput;

import java.io.IOException;

public class C_GettingUserInput {
    public static void main(String[] args) throws IOException { // We need this IOException because we could
                                                                // receive unexpected errors when working with
        System.out.println("Print your first byte");            // input streams


        int inByte = System.in.read(); // This allows us to grab a single character using the keyboard as
                                       // Our input stream
        System.out.println("The first byte that you typed: " + (char)inByte);
        System.out.printf("%s: %c.%n", "The first byte that you typed", inByte);
    }
}
