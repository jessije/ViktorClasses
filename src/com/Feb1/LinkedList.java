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
        if (first.value == a) {
            first = first.next;
            return; //means end of the method, so it wont go further
        }
            Element previous = first;
            Element current = previous.next;
            while (current!=null) {

                if (current.value == a) {
                    previous.next = current.next;
                    break;
                }
                previous = current;
                current = current.next;
            }
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
        System.out.println();
        list.remove(10);
        list.print();
    }
}

class Element {
    int value;
    Element next;

}