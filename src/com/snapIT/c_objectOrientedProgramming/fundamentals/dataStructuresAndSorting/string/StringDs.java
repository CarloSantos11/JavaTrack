package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.string;

import java.util.Arrays;

public class StringDs {
    public static void main(String[] args) {
        String saying = "To be or not to be, that is the question.";

        char mychar = saying.charAt(6);

        int num = saying.length();
        System.out.println("Characater at index 6 is " + mychar);
        System.out.println(num);

        char[] chars = new char [saying.length()]; // initializing a char array with the size of saying variable
        saying.getChars(0, saying.length(), chars, 0);
        System.out.println(Arrays.toString(chars));

    }
}
