package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int total = 0;
        int counter = 0;
        for(int i = 1; i<1001; i++){
            if(i%3==0 && i%5==0){
                total = total + i;
                counter++;
                System.out.println(i);
                if(counter == 5){
                    System.out.println("The total sum is " + total);
                    break;
                }

            }
        }

    }


}
