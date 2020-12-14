package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.linkedlist.playlistchallenge;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }


    // Whenever we create an object of our own we need to specify how it gets printed
    // as a string because java does not know how to represent objects that we create as strings.
    // So we override the toString method which is implicitly called when we use System.out.
    public String toString() {
        return "Title: " + this.title + "\n" + "Duration: " + this.duration +
                "\n";
    }

}
