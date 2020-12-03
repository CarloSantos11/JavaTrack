package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.arrayList;

import com.snapIT.c_objectOrientedProgramming.fundamentals.part1.person.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsArray extends Student{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student carmella = new Student();
        Student marisha = new Student();
        Student christina = new Student();
        Student lester = new Student();

        carmella.setName("Carmella");
        marisha.setName("Marisha");
        christina.setName("Christina");
        lester.setName("Lester");

        students.add(carmella);
        students.add(marisha);
        students.add(christina);
        students.add(lester);

        Iterator<Student> studentsIterator = students.iterator();
        while (studentsIterator.hasNext()) {
            Student student = studentsIterator.next();
            String name = student.getName();
            System.out.println(name);
        }

        students.clear();
        System.out.println(students);
        System.out.println("\"Hello\",said carlo ");
    }
}
