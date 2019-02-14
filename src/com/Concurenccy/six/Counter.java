package com.Concurenccy.six;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
   private int uniqueId;
    Lock lock = new ReentrantLock();

    public synchronized int getUniqueId() {
        return uniqueId;
    }

    public void increment(){
        lock.lock();
        uniqueId++;
        lock.unlock();
    }

}
