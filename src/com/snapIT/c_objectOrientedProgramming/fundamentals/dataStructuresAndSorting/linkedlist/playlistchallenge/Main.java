package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.linkedlist.playlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
//        Song mySong = new Song("The Light", 5.03);
//        Song favSong = new Song("Pineapple Skies", 15.03);
//        Song anotherSong = new Song("someOther", 5.03);
//
//        System.out.println(mySong);
//        System.out.println(favSong);
//        System.out.println(anotherSong);

        Album channelOrange = new Album("Channel Orange", "Frank Ocean");
        Song song = new Song("Pink Matter", 5.00);
        channelOrange.addSong(song.getTitle(), 5.00);
        song = new Song("Suite Life", 5.00);
        channelOrange.addSong(song.getTitle(), 5.00);
        song = new Song("Bad Religion", 3.40);
        channelOrange.addSong(song.getTitle(), 5.00);

        albums.add(channelOrange);

        Album pabloHoney = new Album("Pablo Honey", "RadioHead");
        Song song1 = new Song("Creep", 5.00);
        pabloHoney.addSong(song1.getTitle(), 5.00);
        Song song2 = new Song("Kid A", 5.00);
        pabloHoney.addSong(song2.getTitle(), 5.00);
        Song song3 = new Song("Fake Plastic Trees", 5.00);
        pabloHoney.addSong(song3.getTitle(), 5.00);
        albums.add(pabloHoney);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Bad Religion", playlist);
        albums.get(0).addToPlaylist("Suite Life", playlist);
        albums.get(0).addToPlaylist("Pink Matter", playlist);

        albums.get(1).addToPlaylist("Bad Religion", playlist);
        albums.get(1).addToPlaylist("Creep", playlist);
        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(29, playlist);

        play(playlist);
    }
    // Static methods are class level methods
    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the beginning of the playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    System.out.println("test test");
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }

    }
}
