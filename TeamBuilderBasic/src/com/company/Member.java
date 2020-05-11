package com.company;

public class Member {

    private String name;
    private String surname;
    private char sex;
    private int date;
    private int month;
    private int year;

    public Member(String name, String surname, char sex, int date, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
