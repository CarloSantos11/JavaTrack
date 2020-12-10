package com.snapIT.c_objectOrientedProgramming.fundamentals.dataStructuresAndSorting.linkedlist.playlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkSong: this.songs) {
            if(checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have song of track # " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song songToAddToPlaylist = findSong(songTitle);
        if (songToAddToPlaylist != null) {
            System.out.println("Added to playlist");
            playlist.add(songToAddToPlaylist);
            return true;
        } else {
            System.out.println("Adding to playlist was unsuccessful");
            return  false;
        }
    }


}
