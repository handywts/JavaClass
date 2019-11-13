package com.company;

import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        printArray(sortIntegers(unsortedArray));


    }


        public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " interger values. \r");
        int[] values = new int[number];
        for (int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }






















    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int k = 0; k < array.length; k++) {
            sortedArray[k] = array[k];
        }




















    //These two chunks of code do the same thing, but one is manual and the second is automatic
    //  #1
//        int[] sortedArray = new int[array.length];
//        for (int k = 0; k < array.length; k++) {
//            sortedArray[k] = array[k];
//        }

    //  #2
          //int[] sortedArray = Arrays.copyOf(array, array.length);       //copyOf()   has many different options so choose the one that matches the array datatype.























        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }


















//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//            for (int j = 0; j < array.length; j++) {
//                System.out.println("getting here");
//                if (sortedArray[i] <= array[j]) {
//
//                    sortedArray[i] = array[j];
//
//                }
//            }
//        }

















        return sortedArray;
    }





















    public static void printArray(int[] array) {
        System.out.println("The array in descending order:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }


}














/*
loop to find the largest number
   compare each number and save the larger one each time


   if the value is greater
 */