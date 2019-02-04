package com.Feb1;

public class Arraylist extends LinkedList {

    int[] arr = new int[1000];
    int lastIndex = 0;
    int[] remove = new int[100];

    @Override
    public void add(int a) {
        arr[lastIndex] = a;
        lastIndex++;
    }

    @Override
    public void print() {
        for (int counter = 0; counter < lastIndex; counter++) {
            System.out.print(arr[counter]);
        }
    }

    public void remove(int a, boolean deleteAll) {
        for (int counter = 0; counter < arr.length; counter++) {
            if (arr[counter] == a) {
                for (int counter1 = counter; counter1 < arr.length - 1; counter1++) {
                    arr[counter1] = arr[counter1 + 1];
                }
            }
        }
                lastIndex--;
    }


    public static void main(String[] args) {
        Arraylist arraylist = new Arraylist();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(5);
        arraylist.add(3);
        arraylist.add(7);
        arraylist.print();
        System.out.println();
        arraylist.remove(1);
        arraylist.print();
    }
}
//binary tree for remove metod