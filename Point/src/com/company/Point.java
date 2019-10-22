package com.company;

public class Point {

    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        if(x < 0) {
            this.x = 0;
        }
        if(y < 0) {
            this.y = 0;
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return (Math.sqrt(x*x + y*y));
    }


    public double distance(int x, int y) {
        return (Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y)));
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }

}
