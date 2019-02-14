package com.Concurenccy.six;

public class Example {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        counterThread1.start();
        System.out.println("Counter: " + counter.getUniqueId());
        counterThread2.start();
        System.out.println("Counter: " + counter.getUniqueId());
        counterThread3.start();
        System.out.println("Counter: " + counter.getUniqueId());
        System.out.println("Counter: " + counter.getUniqueId());
    }
}
