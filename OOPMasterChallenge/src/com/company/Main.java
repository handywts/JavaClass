package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger bill = new Hamburger("Bill S", "White", "beef", 8.00);
        bill.setBacon(true);
        //System.out.println(bill.getPrice());
        //bill.order();
        bill.total(8.00);
        System.out.println("");

        HealthyBurger steve = new HealthyBurger("Steve", "Wheat", "Chicken",8.00);
        steve.setCarrot(true);
        steve.setBacon(true);
        //steve.order();
        steve.total(9.00);
        System.out.println("");

        DeluxeBurger harry = new DeluxeBurger("Harry", "Sourdough", "Chicken", 12.00);
        harry.setCheese(true);
        harry.total(12.00);

    }
}
