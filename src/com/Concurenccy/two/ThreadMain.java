package com.Concurenccy.two;

import com.Concurenccy.two.StopWatchThread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread starts");
        StopWatchThread stopWatchThread = new StopWatchThread();
        stopWatchThread.setDaemon(true); // means please wait for other thread's work
        stopWatchThread.start();
       System.out.println("Main thread starts");
      Thread.sleep(1000);
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");

    }
}
