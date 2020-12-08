package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.streamsAndReaders;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("output.txt"));
        } catch (IOException e) {
            return;
        }
    }
}
