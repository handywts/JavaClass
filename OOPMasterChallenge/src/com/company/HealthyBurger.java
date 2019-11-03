package com.company;

public class HealthyBurger extends Hamburger {


//Fields
    private boolean carrot;
    private boolean spinach;




//Constructors
    public HealthyBurger(String name, String bread, String meat, double price) {
        super(name, "Brown Rye", meat, 9.00);
        this.carrot = false;
        this.spinach = false;
    }





//Getters and Setters
    public boolean isCarrot() { return carrot;    }

    public void setCarrot(boolean carrot) { this.carrot = carrot;    }

    public boolean isSpinach() {return spinach;    }

    public void setSpinach(boolean spinach) {this.spinach = spinach;    }




//Methods



//    @Override
//    public void order() {
//        super.order();
//    }


    @Override
    public double total(double price) {
        double basicPrice =  super.total(price);
        if (isCarrot()) {
            basicPrice += getAdditionPrice();
            System.out.println("Added carrot for " + getAdditionPrice());
        }
        if (isSpinach()) {
            basicPrice += getAdditionPrice();
            System.out.println("Added carrot for " + getAdditionPrice());
        }
        System.out.println("The total is " + basicPrice);
        return basicPrice;
    }
}
