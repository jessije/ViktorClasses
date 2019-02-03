package com.Feb1;

import java.util.ArrayList;

public class LinkedList extends List {
    Element first;

    @Override
    public void add(int a) {
        Element element = new Element();
        element.value = a;
        element.next = first;
        first = element;
    }

    @Override
    public void remove(int a) {

    }

    @Override
    public void print() {
        Element temporary = first;
        while(temporary !=null){
            System.out.print(temporary.value + " ");
            temporary = temporary.next;
        }
    }
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.print();
        list.add(5);
        list.print();

        Arraylist arraylist = new Arraylist();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.print();

    }
}

class Element {
    int value;
    Element next;

}