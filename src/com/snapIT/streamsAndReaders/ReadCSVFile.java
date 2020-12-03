package com.snapIT.streamsAndReaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) throws FileNotFoundException {


        FileReader fileReader = new FileReader("/Users/carlo/Desktop/work/Class/Java/JavaTutorial/JavaTrack/src/com/snapIT/streamsAndReaders/file.txt");
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
