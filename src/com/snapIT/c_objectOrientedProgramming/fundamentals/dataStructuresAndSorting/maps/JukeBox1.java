package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.maps;

import java.io.*;
import java.util.ArrayList;

/**
 * This exercise is from the Java Head First Book: Collections and Generics
 *
 */
public class JukeBox1 {
    ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBox1().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        System.out.println(lineToParse);
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
