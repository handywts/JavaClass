package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    Create a new project
    Create a class
    Make the class so that it does all the work.
    The array will be 10 digits long.

     */









    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //Creating an Array
        int[] myInts = new int [5] ;
        int[] yourInts = new int[] {5,4,3,2,1};

        //Print an array
        System.out.println(Arrays.toString(myInts));

        //Print one element
        System.out.println(      yourInts[4]     );
        //Print all elements
        for(int i = 0; i < 5; i++) {
            System.out.println(     yourInts[i]    );
        }

        //Sort an array
        Arrays.sort(yourInts);
        System.out.println(Arrays.toString(yourInts));

        //Flipping an array
        for (int left = 0, right = yourInts.length-1; left < right; left++, right--) {
            int temp = yourInts[left];
            yourInts[left] = yourInts[right];
            yourInts[right] = temp;
        }
        System.out.println(Arrays.toString(yourInts));


































        //The below commented code is the first look at arrays, the code above it is a real world use
//        int[] myIntegers = getIntegers(5);
//
//        for (int i = 0; i<myIntegers.length; i++) {
//            System.out.println("Element " + i + ", values are " + myIntegers[i]);
//        }
//
//        System.out.println("The average is " + getAverage(myIntegers));




//        int[] myIntArray = new int[10];
//        for (int i = 0; i < myIntArray.length; i++) {   //length works because the number of elements was set to 10
//            myIntArray[i] = i*10;
//        }
//        for(int i = 0; i < myIntArray.length; i++) {    //length works because it will see how many values are in the array
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }

        //printArray(myIntArray);    //the method and call does the same thing as the above for loop


        //int[] myIntArray = new int[10];   //Started a new array and gave the array 10 elements of int type to be filled
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};  //Started a new array with predefined values
        //myIntArray[5] = 50;

//        System.out.println(myIntArray[5]);  //accessing individual elements of an array
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[9]);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " interger values. \r");
        int[] values = new int[number];
        for (int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        total = total / array.length;
        return total;
    }



//    public static void printArray(int[] array) {   //Can pass an entire array as an array is viewed as a single entity
//        for(int i = 0; i < array.length; i++) {    //length works because it will see how many values are in the array
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
}
