package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));

        }
    }
//Change the following two methods to private to force the use of the overloaded versions
    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    private void removeGroceryItem(int position) {
        //String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
        //The following commented code is the original way of doing findItem, it was then modified to the current code below.

        //boolean exists = groceryList.contains(searchItem);     //this line and the next are two ways of searching the arraylist to find an element
//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }

        return groceryList.indexOf(searchItem);
    }

 //Overloaded version of the original modifyGroceryItem that will not require the user to know index numbers
    public void modifyGroceryList(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryList(position, newItem);
        }
    }

 //Same as the above modify method, but for remove.
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }

}
