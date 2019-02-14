package com.Concurenccy.three;

public class StopWatchThread1 extends Thread {
    private String prefix;
    public StopWatchThread1(String prefix){
        this.prefix = prefix;

    }
    @Override
    public void run() {
        for(int i = 0;i<10; i++){
           System.out.println("Prefix "+ prefix+ "counter "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


