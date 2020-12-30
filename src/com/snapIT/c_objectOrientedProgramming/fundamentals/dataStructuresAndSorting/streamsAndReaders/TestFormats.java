package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.streamsAndReaders;

public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);

//        s = String.format("%,8d",2);
//        System.out.println(s);

//        s = String.format("%,8.1f",2.000);
//        System.out.println(s);
    }
}
