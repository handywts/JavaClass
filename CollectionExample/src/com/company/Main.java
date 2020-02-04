package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        CollectionExampleLists example = new CollectionExampleLists();

        Scanner input = new Scanner(System.in);

        boolean quit = false;

        while(quit != true) {
            System.out.println("What number do you want to enter (-1 to quit)");
            int num = input.nextInt();
            if(num == -1) {
                break;
            }
        }

    }














//    public static void main(String[] args) {
//        boolean exit = false;
//        CollectionExampleStack queue = new CollectionExampleStack();
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Collection manipulation program");
//
//        while (exit == false) {
//            System.out.println("Select one of the following options: \n" +
//                    "1 - Push element to queue \n" +
//                    "2 - Pop element from queue \n" +
//                    "3 - Print the elements of the queue \n" +
//                    "4 - Exit \n" +
//                    "What is your selection?");
//
//            int selection = input.nextInt();
//            System.out.println();
//
//            switch (selection) {
//                case 1:
//                    System.out.println("Enter element: ");
//                    int element = input.nextInt();
//                    queue.push(element);
//                    break;
//                case 2:
//                    queue.pop();
//                    break;
//                case 3:
//                    queue.printElement();
//                    break;
//                case 4:
//                    exit = true;
//                    break;
//            }
//
//            System.out.println();
//        }
//    }






//    public static void main(String[] args) {
//        boolean exit = false;
//        CollectionExampleQueue queue = new CollectionExampleQueue();
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Collection manipulation program");
//
//        while (exit == false) {
//            System.out.println("Select one of the following options: \n" +
//                    "1 - Offer element to queue \n" +
//                    "2 - Poll element from queue \n" +
//                    "3 - Print the elements of the queue \n" +
//                    "4 - Exit \n" +
//                    "What is your selection?");
//
//            int selection = input.nextInt();
//            System.out.println();
//
//            switch (selection) {
//                case 1:
//                    System.out.println("Enter element: ");
//                    int element = input.nextInt();
//                    queue.offer(element);
//                    break;
//                case 2:
//                    queue.poll();
//                    break;
//                case 3:
//                    queue.printElement();
//                    break;
//                case 4:
//                    exit = true;
//                    break;
//            }
//
//            System.out.println();
//        }
//    }




//    public static void main(String[] args) {
//        boolean exit = false;
//        Stack queue = new Stack();
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Collection manipulation program");
//
//        while (exit == false) {
//            System.out.println("Select one of the following options: \n" +
//                    "1 - Push element to queue \n" +
//                    "2 - Pop element from queue \n" +
//                    "3 - Print the elements of the queue \n" +
//                    "4 - Exit \n" +
//                    "What is your selection?");
//
//            int selection = input.nextInt();
//            System.out.println();
//
//            switch (selection) {
//                case 1:
//                    System.out.println("Enter element: ");
//                    int element = input.nextInt();
//                    queue.push(element);
//                    break;
//                case 2:
//                    queue.pop();
//                    break;
//                case 3:
//                    if (queue.isEmpty()) {
//                        System.out.println("The queue is empty.");
//                    }else{
//                        for(int i = queue.size() - 1; i >= 0; i--) {
//                            System.out.println(queue.get(i));
//                        }
//                    }
//                    break;
//                case 4:
//                    exit = true;
//                    break;
//            }
//
//            System.out.println();
//        }
//    }



//    public static void main(String[] args) {
//        boolean exit = false;
//        Queue queue = new LinkedList();
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Collection manipulation program");
//
//        while (exit == false) {
//            System.out.println("Select one of the following options: \n" +
//                    "1 - Push element to queue \n" +
//                    "2 - Pop element from queue \n" +
//                    "3 - Print the elements of the queue \n" +
//                    "4 - Exit \n" +
//                    "What is your selection?");
//
//            int selection = input.nextInt();
//            System.out.println();
//
//            switch (selection) {
//                case 1:
//                    System.out.println("Enter element: ");
//                    int element = input.nextInt();
//                    queue.add(element);
//                    break;
//                case 2:
//                    queue.poll();
//                    break;
//                case 3:
//                    if (queue.isEmpty()) {
//                        System.out.println("The stack is empty.");
//                    }else{
//                        for(int i = 0; i <= queue.size()-1; i++) {
//                            System.out.println(queue.toString());
//                        }
//                    }
//                    break;
//                case 4:
//                    exit = true;
//                    break;
//            }
//
//            System.out.println();
//        }
//    }




}
