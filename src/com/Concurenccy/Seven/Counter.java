package com.Concurenccy.Seven;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
   private AtomicInteger uniqueId = new AtomicInteger();
    public void increment(){
        uniqueId.incrementAndGet();
    }
    public int getUniqueId() {
        return uniqueId.get();
    }
}
