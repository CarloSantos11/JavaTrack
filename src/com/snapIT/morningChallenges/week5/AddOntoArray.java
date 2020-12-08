package com.snapIT.morningChallenges.week5;

import java.util.Arrays;

public class AddOntoArray {
    public static void main(String[] args) {

        int[] testArray = {5,7,8,9};
        int testElement = 99;

        testArray = addOntoArray(testArray,testElement);
        System.out.println(Arrays.toString(testArray));
    }

    public static int[] addOntoArray(int[] arrayParam, int numToAdd) {
        int[] newArray = new int[arrayParam.length + 1];

        for(int i = 0; i < arrayParam.length; i++) {
            newArray[i] = arrayParam[i];
        }

        newArray[newArray.length -1 ] = numToAdd;

        return newArray;
    }
}
