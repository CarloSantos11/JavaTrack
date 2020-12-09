package com.snapIT.morningChallenges.week5;


//Create a method called switchString(String stringArg) that takes a string argument.
//        We want to split the array in half and switch the first segment with the last segment.
//        If we have odd letters leave the middle letter in the center.
public class SwitchString {
    public static void main(String[] args) {
        System.out.println(switchString("Reef")); // elsaRaf
    }


    public static String switchString(String myWord){
        int midway = myWord.length() / 2;
        String middleChar = "";
        String frontHalf = "";
        String backHalf = "";
        String result = "";


        if (myWord.length() % 2 == 0) {
            // logic when even
            frontHalf =  myWord.substring(0, midway);
            backHalf = myWord.substring(midway);
            result = backHalf + frontHalf ;
        } else {
            // logic when odd
            middleChar = myWord.substring(midway, midway + 1);
            frontHalf = myWord.substring(0,midway);
            backHalf = myWord.substring(midway+1);
            result = backHalf + middleChar + frontHalf;
        }
        return result;
    }
}

// lets create a way to find if the word is even or odd
