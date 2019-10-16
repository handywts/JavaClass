package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here




        int count = 1;
        while(count!=6){
            System.out.println("Count value is " + count);
            count++;
        }




        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }




        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count>100) {
                break;
            }
        }while(count !=6);






        int total = 0;
        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            total++;
            System.out.println("Even number " + number);
            if(total == 5){
                break;
            }
        }
        System.out.println("total is " + total);
    }



    public static boolean isEvenNumber(int a){
        if(a%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
