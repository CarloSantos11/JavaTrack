package com.snapIT.morningChallenges.week1;

public class B_LoopingChallenge {
//    Ch 2
//            - create a new class called Loops
//            - create a loop to count from 0 to 100
//            - create a loop that counts from 100 down to 1
//            - create a loop that counts by 2's to 100
//            - create a loop that counts by 3's up to 100
    public static void main(String[] args) {
        // while
        // do while
        // for loop

        int counter = 0;

        do {
            System.out.println(counter);
            counter = counter + 1;
        } while (counter <= 100);

        for (int counter2 = 0; counter2 <= 100; counter2++) {
            System.out.println(counter2);
        }

        int counter3 = 0;
        while (counter3 <= 100) {
            System.out.println(counter3);
            counter3++;
        }
    }
}
