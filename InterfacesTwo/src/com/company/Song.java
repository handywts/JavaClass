package com.company;

import java.util.Scanner;

public class Song {

//Fields
    private String title;
    private double duration;
    private Scanner scanner = new Scanner(System.in);


//Constructors
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }


//Getters and Setters
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public double getDuration() {return duration;}
    public void setDuration(double duration) {this.duration = duration;}


//Methods

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
