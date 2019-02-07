package com.feb6.generics;

public class Student implements Comparable<Student>{
    int age;

    public Student (int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Student{" +
                "age = " + age +
                '}';
    }
    @Override
    public int compareTo(Student el){
        if(this.age > el.age){
            return 1;
        }else{
            return 0;
            //return el.age > this.age ? 1:0;
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student(21);
        Student student2 = new Student (22);
        student1.compareTo(student2);
    }
}
