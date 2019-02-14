package com.Concurenccy.six;

public class CounterThread extends Thread{
    Counter counter;
    public CounterThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.increment();
    }
}
