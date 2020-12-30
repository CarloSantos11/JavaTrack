package com.snapIT.morningChallenges.week7;

import java.util.Arrays;

public class WhiteBoardProblem {
    // Array: add another number to this array [1,2,3,5]

    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,5};

        int[] newArray = addArrayElement(33,arrayOne);

        System.out.println(Arrays.toString(newArray));
    }

    public static int[] addArrayElement(int numToPass, int[] existingArray) {
        int[] copy = new int [existingArray.length +1];
        int i = 0;

        for (int num: existingArray) {
            copy[i] = num;
            i++;
        }
        copy[i] = numToPass;
        return copy;
    }
}
