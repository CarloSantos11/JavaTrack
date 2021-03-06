package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.linkedlist.playlistchallenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albumsCollection = new ArrayList<>();
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

        albumsCollection.add(channelOrange);

        Album pabloHoney = new Album("Pablo Honey", "RadioHead");
        Song song1 = new Song("Creep", 5.00);
        pabloHoney.addSong(song1.getTitle(), 5.00);
        Song song2 = new Song("Kid A", 5.00);
        pabloHoney.addSong(song2.getTitle(), 5.00);
        Song song3 = new Song("Fake Plastic Trees", 5.00);
        pabloHoney.addSong(song3.getTitle(), 5.00);
        albumsCollection.add(pabloHoney);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albumsCollection.get(0).addToPlaylist("Bad Religion", playlist);
        albumsCollection.get(0).addToPlaylist("Suite Life", playlist);
        albumsCollection.get(0).addToPlaylist("Pink Matter", playlist);

        albumsCollection.get(1).addToPlaylist("Bad Religion", playlist);
        albumsCollection.get(1).addToPlaylist("Creep", playlist);
        albumsCollection.get(1).addToPlaylist(1, playlist);
        albumsCollection.get(1).addToPlaylist(29, playlist);

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
            printMenu();
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
                    if(forward) {
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        }  else {
                            System.out.println("We are at  the start of the list");
                        }
                    } else {
                        // going backwards
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printSongs(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    listIterator.remove();
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.next());
                    }

            }
        }

    }

    private static void printMenu(){
        System.out.println(
                "Available Options\n" +
                "0 - quit \n" +
                "1 - play next\n" +
                "2 - play previous \n" +
                "3 - to replay current song\n" +
                "4 - list songs \n" +
                "5 - print available actions\n" +
                "6 - remove song"
        );
    }

    private static void printSongs(LinkedList playlist){
        Iterator<Song> iterator  = playlist.iterator();
        System.out.println("===========================\n");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
    }

}
