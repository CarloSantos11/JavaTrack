package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> todo = new LinkedList<>();

        todo.add("Code");
        todo.add("Finish Final");
        todo.add("Learn Design patterns");
        todo.add("Learn Data Structures");

        Iterator<String> i = todo.iterator();

        while (i.hasNext()) {
            System.out.println("Must complete: " + i.next());
        }
    }
}
