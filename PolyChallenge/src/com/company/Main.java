package com.company;

class Car {
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;

    public Car(String name, String engine, int cylinders, int wheels) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = engine;
        this.wheels = wheels;
    }
    public String getName() {
        return name;
    }
    public String getEngine() {
        return engine;
    }
    public int getCylinders() {
        return cylinders;
    }
    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Engine is running";
    }

    public int accelerate() {
        return 20;
    }

    public int brake() {
        return -20;
    }
}

class porsche extends Car {
    public porsche() {
        super("porsche", "v8", 8, 4);
    }

    public int accelerate() {
        return 120;
    }
}

class yugo extends Car {
    public yugo() {
        super("yugo", "4 cylinder", 4, 2);
    }

    public String startEngine() {
        return getClass().getSimpleName() + " Engine is barely running";
    }
}

class renegade extends Car {
    public renegade() {
        super("renegade", "Cummings Diesel", 6, 2);
    }

    public int accelerate() {
        return 60;
    }
}

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++){
            Car car = randomCar();
            System.out.println(car.getName() + "\n" + car.startEngine() + "\n" + car.accelerate() + "\n");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) +1;
        System.out.println(randomNumber);
        switch (randomNumber) {
            case 1:
                return new porsche();
            case 2:
                return new yugo();
            case 3:
                return new renegade();
        }
        return null;
    }
}
