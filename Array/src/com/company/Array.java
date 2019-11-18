package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    private int[] numbers = new int[10];
    private Scanner scanner = new Scanner(System.in);


//Getters
    public int[] getNumbers() {
        return numbers;
    }
    public int getNumber(int index) {
        return numbers[index];
    }
//Setters
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    public void setNumber(int index, int numberToBeAdded) {
        this.numbers[index] = numberToBeAdded;
    }
    public void setArray (int size) {
        this.numbers = new int[size];
    }




//Constructors
    public Array(){
    }
    public Array(int[] numbers) {
        this.numbers = numbers;
    }



//Methods
    public void printArray() {                                       // To print an array.
        System.out.println(Arrays.toString(numbers) + "\n");
    }

    public void fillArray() {                                        // Use to fill any size array with user inputs.
        System.out.println("What number do you want to add? ");
        for (int i = 0; i < numbers.length; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }
    }

    public int[] copyArray() {                                      // To copy an existing array to a new array.
        int[] copiedArray = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            copiedArray[i] = numbers[i];
        }
        return copiedArray;
    }

    public void convertToAscendingArray() {                        // Converts the array to an array with all numbers moved to ascending order.
        Arrays.sort(numbers);
    }
    public void ascendingOrderToNewArray() {                       // This prints a version of the array with all numbers in ascending order.
        int[] newArray = copyArray();
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray) + "\n");
    }

    public void descendingOrderToNewArray() {                      // This prints a version of the array with all numbers in descending order.
        int[] newArray = copyArray();
        int[] orderedArray = copyArray();

        boolean flag = true;
        int temp = 0;
        while(flag) {
            flag = false;

            for (int i = 0; i < orderedArray.length-1; i++) {
                if(orderedArray[i] < orderedArray[i+1]) {
                    temp = orderedArray[i];
                    orderedArray[i] = orderedArray[i+1];
                    orderedArray[i+1] = temp;
                    flag = true;
                }

            }
        }
        System.out.println(Arrays.toString(orderedArray) + "\n");

    }

    public double getAverage() {                                   // Takes all the numbers and finds an average between them.
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        total = total / numbers.length;
        return total;
    }
}
