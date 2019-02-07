package com.feb6.generics;


import java.util.List;

public class LinkedListfloat<T extends Comparable> {
    Element1 <T> first;

    public void add(T a) {
        Element1 element1 = new Element1();
        element1.value = a;
        element1.next = first;
        first = element1;
    }

    public void sort() {
Element1<T> i = first;
while(i.next!=null){
    Element1<T> j = i.next;
    while(j.next !=null){
        if(i.value.compareTo(j.value)==1){
            T temp = i.value;
            i.value = j.value;
            j.value = temp;

        }
        j=j.next;
    }
    i = i.next;
}

    }
    public void swap(){
        Element1<T> i = first;
        Element1<T> j = i; //i.next

        while(j.next !=null){
            j=j.next;
        }
        T temp = j.value;
        i.value = j.value;
        j.value = temp;
    }

    public void remove(T a) {
        if (first.value.equals(a)) {
            first = first.next;
            return; //means end of the method, so it wont go further
        }
        Element1 previous = first;
        Element1 current = previous.next;
        while (current != null) {

            if (current.value.equals(a)) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }
    }
//    public void sum() {
//        Element1 temporary = first;
//        int sum = 0;
//        while (temporary != null) {
//            sum+=temporary.value.intValue();
//            temporary = temporary.next;
//        }
//        System.out.println(sum);
//    }

    public void print() {
        Element1 temporary = first;
        while (temporary != null) {
            System.out.print(temporary.value + " ");
            temporary = temporary.next;
        }
    }

    public static void main(String[] args) {

//        Student[] students = new Student[4];
//        students[0] = new Student(32);
//        students[1] = new Student(22);
//        students[2] = new Student(25);
//        students[3] = new Student(19);
//
//        for (Student s : students) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < students.length - 1; ++i) {
//            for (int j = i + 1; j < students.length; ++j) {
//                if (students[i].compareTo(students[j]) == 1) {
//                    Student temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//
//                }
//            }
//        }
//        System.out.println("sorted array");
//        for (Student s : students) {
//            System.out.println(s);
//        }
//        LinkedListfloat <String> list = new LinkedListfloat<>();
//        list.add("a");
//        list.add("b");
//        list.print();
//        list.add("c");
//        list.print();
//        System.out.println();
//        list.remove("c");
//        list.print();
//        System.out.println();
        LinkedListfloat<Student> list1 = new LinkedListfloat<>();
        list1.add(new Student(28));
        list1.add(new Student(24));
        list1.add(new Student(25));
        Student a = new Student(24);
        list1.add(a);
        list1.add(new Student(30));
        list1.print();
        System.out.println();
        list1.remove(a);
        list1.sort();
        list1.print();
        list1.swap();
    }

    class Element1 <T extends Comparable> {
        T value;
        Element1 next;
    }
}

