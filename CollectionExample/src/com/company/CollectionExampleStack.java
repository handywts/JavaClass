package com.company;

/*
Stack = LIFO
   Last In First Out

Push = adding something to the stack
Pop = retrieving something from a stack
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExampleStack {

    private LinkedList<Integer> Stack;

    public CollectionExampleStack() {
        Stack = new LinkedList<Integer>();
    }

    public void push(int number) {
        Stack.add(number);
    }

    public void pop() {
        if (Stack.isEmpty()) {
            System.out.println("The stack is empty.");
        }else{
            int number = Stack.get(Stack.size() - 1);
            Stack.remove(Stack.size() - 1);
            System.out.println("Element removed: " + number);
        }
    }

    public void printElement() {
        if (Stack.isEmpty()) {
            System.out.println("The stack is empty.");
        }else{
            for(int i = Stack.size() - 1; i >= 0; i--) {
                System.out.println(Stack.get(i));
            }
        }
    }

}
