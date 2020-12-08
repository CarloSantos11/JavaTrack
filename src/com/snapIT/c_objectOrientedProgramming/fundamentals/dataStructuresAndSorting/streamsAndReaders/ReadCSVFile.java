package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.streamsAndReaders;

import java.io.*;

public class ReadCSVFile {
    public static void main(String[] args) throws FileNotFoundException {


        FileReader fileReader = new FileReader("file.txt");
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            int lineCounter = -1;
            while((line = reader.readLine()) != null) {
                lineCounter++;
                //Ignore the header
                if (lineCounter == 0) {
                    continue;
                }
                String[] split = line.split(",");
                System.out.printf("%d - %s\n", lineCounter, split[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
