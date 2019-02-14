package com.Concurenccy.Seven;

public class Example {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        counterThread1.start();
        //System.out.println("UniqueID: " + counter.getUniqueId());
        counterThread2.start();
        //System.out.println("UniqueID: " + counter.getUniqueId());
        counterThread3.start();
        //System.out.println("UniqueID: " + counter.getUniqueId());
        //System.out.println("UniqueID: " + counter.getUniqueId());
    }
}
