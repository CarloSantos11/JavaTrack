package com.snapIT.morningChallenges.week4;


// take the string argument
// reverse the string
// compare the first string to the reversed string

public class IsPlaindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("molkajdfm"));

    }

    private static boolean isPalindrome(String wordTest) {
        StringBuilder reverseReverse = new StringBuilder();
        String[] myWord = wordTest.split("");

        for(int i = wordTest.length()-1; i >= 0; i--){
           reverseReverse.append(myWord[i]);
        }

        System.out.println(reverseReverse);
        if(reverseReverse.toString().equals(wordTest)){
            System.out.println("awww yeah that's a palindrome");
            return true;
        }
        return false;

    }
}
