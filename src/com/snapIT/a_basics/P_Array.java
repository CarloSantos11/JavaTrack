package com.snapIT.a_basics;

public class P_Array {
    public static void main(String[] args) {
//        // Simple array example
//        int[] myArray = new int[7];
//
//        for ( int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }

        P_Dog pets[];

        pets = new P_Dog[7];

        pets[0] = new P_Dog();
        pets[1] = new P_Dog();

        pets[0].name = "Kaylah";
        System.out.println("This is our new dog " + pets[0].name + ".");
        pets[0].bark();

        pets[1].name = "Buddy";
        System.out.println("This is our new dog " + pets[1].name + ".");
        pets[0].bark();
    }
}

