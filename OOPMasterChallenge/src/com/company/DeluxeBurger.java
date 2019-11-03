package com.company;

public class DeluxeBurger extends Hamburger{







//Constructors

    public DeluxeBurger(String name, String bread, String meat, double price) {
        super(name, bread, meat, price);
        setDrink(true);
        setChips(true);
    }








    @Override
    public void setLettuce(boolean lettuce) {
        System.out.println("Can't add this for Deluxe");
    }

    @Override
    public void setTomato(boolean tomato) {
        System.out.println("Can't add this for Deluxe");
    }

    @Override
    public void setCheese(boolean cheese) {
        System.out.println("Can't add this for Deluxe");
    }

    @Override
    public void setBacon(boolean bacon) {
        System.out.println("Can't add this for Deluxe");
    }
}
