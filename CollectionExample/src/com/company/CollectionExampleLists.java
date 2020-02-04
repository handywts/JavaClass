package com.company;

import java.util.ArrayList;

public class CollectionExampleLists {

    ArrayList<Integer> arrayList;

    public CollectionExampleLists() {
        this.arrayList = new ArrayList<Integer>();
    }

    public void setArrayList(ArrayList outsideArray) {
        this.arrayList = outsideArray;
    }

    public void setArrayElement(Integer number) {
        arrayList.add(number);
    }

    public void setArrayElementAndLocation(int index, Integer number) {
        arrayList.add(index, number);
    }



}
