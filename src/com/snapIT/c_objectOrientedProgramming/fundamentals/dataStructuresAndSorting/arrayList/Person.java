package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.arrayList;

import java.util.ArrayList;

public class Person {

    public static void main(String[] args) {
        Person john = new Person();
        // Initialize size of 0
        ArrayList<Integer> myArrayList = new ArrayList<>();
        System.out.println("Size of myArrayList:" + myArrayList.size());

        // Initialize size of 5
        ArrayList<Integer> myArrayList1 = new ArrayList<>(5);
        myArrayList1.add(5);
        myArrayList1.add(1,8);
        System.out.println("Size of myArrayList1:" + myArrayList1.size());
        System.out.println("myArrayList1 " + myArrayList1.toString());

        // List of Person objects
       ArrayList<Person> people = new ArrayList<>();
       people.add(john);
       System.out.println("Size of people: " + people.size());


       System.out.println(people.get(0));

       myArrayList1.add(10);
       Integer one = myArrayList1.get(0);
       System.out.println(myArrayList1.toString());

       System.out.println(myArrayList1.get(myArrayList1.size()-1));

    }
}
