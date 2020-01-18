package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album  {


//Fields
    private String name;
    private String artist;
    private ArrayList<Song> songs;



//Constructor
    public Album(String name, String artist) {
        this.songs = new ArrayList<Song>();
        this.name = name;
        this.artist = artist;
    }



//Getters and Setters
    //Get and Set entire album
    public ArrayList<Song> getSongs() {return songs;}
    public void setSongs(ArrayList<Song> songs) {this.songs = songs;}

    //Get and Set single song object
    public Song getSong(int index) {return songs.get(index);}
    public void setSong(int index, Song song) {songs.set(index,song);}

    public String getArtist() {return artist;}
    public String getName() {return name;}
    public void setArtist(String artist) {this.artist = artist;}
    public void setName(String name) {this.name = name;}




//Methods

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    //Add a song by tracknumber
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    //Add a song by name
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }


}
