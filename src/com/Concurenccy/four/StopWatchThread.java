package com.Concurenccy.four;

public class StopWatchThread implements Runnable {

    @Override
    public void run() {
        for(int i =0; i<10; i++){
            System.out.println("stop watch: "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
