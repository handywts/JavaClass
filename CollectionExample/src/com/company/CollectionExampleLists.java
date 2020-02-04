package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExampleLists {

    private ArrayList<Integer> arrayList;

    public CollectionExampleLists() {
        this.arrayList = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void setElement(Integer number) {
        this.arrayList.add(number);
    }

    public void checkEmpty() {
        if(arrayList.isEmpty()) {
            System.out.printf("There is nothing here.");
        }else{
            System.out.printf("There is something here.");
        }
    }

    public void goingThroughArray() {

        Iterator iterator = arrayList.iterator();



        while(iterator.hasNext()) {
            int num =
        }
    }


























    //    ArrayList<Integer> arrayList;
//
//    public CollectionExampleLists() {
//        this.arrayList = new ArrayList<Integer>();
//    }
//
//    public void setArrayList(ArrayList outsideArray) {
//        this.arrayList = outsideArray;
//    }
//
//    public void setArrayElement(Integer number) {
//        arrayList.add(number);
//    }
//
//    public void setArrayElementAndLocation(int index, Integer number) {
//        arrayList.add(index, number);
//    }
//
//
//    public void iteratingThroughCollections() {
//        Iterator iterator = arrayList.iterator();
//
//        if(arrayList.isEmpty()) {
//            System.out.printf("The array is empty, try putting something in it.");
//        }else {
//            while (iterator.hasNext()) {
//                Integer i = (Integer) iterator.next();
//            }
//        }
//    }

}
