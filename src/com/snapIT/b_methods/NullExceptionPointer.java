package com.snapIT.b_methods;

public class NullExceptionPointer {
    public static void main(String[] args) {
        String[] myArray = new String [5];

        myArray[0] = "This";  // [ 1,2,null,null,null]
        myArray[1] = "That";

        for (String myNum :
             myArray) {
            System.out.println(myNum.length());
        }
    }
}
