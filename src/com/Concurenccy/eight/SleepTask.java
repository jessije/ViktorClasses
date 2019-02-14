package com.Concurenccy.eight;

public class SleepTask implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("I am sleeping....");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
