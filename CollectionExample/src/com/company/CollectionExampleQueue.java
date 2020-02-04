package com.company;

import java.util.LinkedList;


public class CollectionExampleQueue {

    private LinkedList<Integer> queue;

    public CollectionExampleQueue() {
        queue = new LinkedList<Integer>();
    }

    public void offer(int number) {
        queue.add(number);
    }

    public void poll() {
        if (queue.isEmpty()) {
            System.out.println("The stack is empty.");
        }else{
            int number = queue.get(0);
            queue.remove(0);
            System.out.println("Element removed: " + number);
        }
    }

    public void printElement() {
        if (queue.isEmpty()) {
            System.out.println("The stack is empty.");
        }else{
            for(int i = 0; i <= queue.size()-1; i++) {
                System.out.println(queue.get(i));
            }
        }
    }

}
