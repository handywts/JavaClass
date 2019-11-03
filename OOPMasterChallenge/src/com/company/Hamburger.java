package com.company;

import java.util.NoSuchElementException;

public class Hamburger {


//Fields
    private String name;
    private String bread;
    private String meat;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean bacon;
    private boolean chips;
    private boolean drink;
    private double additionPrice;





//Constructors
    public Hamburger(String name, String bread, String meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.name = name;
        this.lettuce = false;
        this.tomato = false;
        this.cheese = false;
        this.bacon = false;
        this.additionPrice = 1.00;
    }




//Getters and Setters
    public String getName() { return name;    }

    public void setName(String name) { this.name = name;    }

    public String getBread() { return bread;    }

    public void setBread(String bread) { this.bread = bread;    }

    public String getMeat() { return meat;    }

    public void setMeat(String meat) { this.meat = meat;    }

    public double getPrice() { return price;    }

    public void setPrice(double price) { this.price = price;    }

    public boolean isLettuce() { return lettuce;    }

    public void setLettuce(boolean lettuce) { this.lettuce = lettuce;    }

    public boolean isTomato() {return tomato;    }

    public void setTomato(boolean tomato) {this.tomato = tomato;    }

    public boolean isCheese() { return cheese;    }

    public void setCheese(boolean cheese) {this.cheese = cheese;    }

    public boolean isBacon() {return bacon;    }

    public void setBacon(boolean bacon) { this.bacon = bacon;    }

    public double getAdditionPrice() {return additionPrice;}

    public void setAdditionPrice(double additionPrice) { this.additionPrice = additionPrice;}

    public boolean isChips() {        return chips;    }

    public void setChips(boolean chips) {        this.chips = chips;    }

    public boolean isDrink() {        return drink;    }

    public void setDrink(boolean drink) {        this.drink = drink;    }



//Methods

//    public void order() {
//        String additions = "";
//        if(isBacon()) {
//            additions = additions + "and bacon ";
//        }
//        if(isCheese()) {
//            additions = additions + "and cheese ";
//        }
//        if(isLettuce()) {
//            additions = additions + "and lettuce ";
//        }
//        if(isTomato()) {
//            additions = additions + "and tomato ";
//        }
//        System.out.println("The completed order:");
//        System.out.println("You ordered a hamburger " + additions);
//        System.out.println("The total is " + total(price));
//    }

    public double total(double price) {
        System.out.println(getName() + " has ordered a " + getMeat() + " hamburger on a " + getBread() + " roll for " + getPrice());
        double total = price;
        if(lettuce) {
            total += getAdditionPrice();
            System.out.println("Added lettuce for " + getAdditionPrice());
        }
        if(tomato) {
            total += getAdditionPrice();
            System.out.println("Added tomato for " + getAdditionPrice());
        }
        if (cheese) {
            total += getAdditionPrice();
            System.out.println("Added cheese for " + getAdditionPrice());
        }
        if (bacon) {
            total += getAdditionPrice();
            System.out.println("Added bacon for " + getAdditionPrice());
        }
        if (chips) {

            System.out.println("Added chips");
        }
        if (drink) {

            System.out.println("Added a drink");
        }
        System.out.println("The total is " + total);
        return total;

    }
}
