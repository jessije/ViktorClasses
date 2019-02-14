package com.Concurenccy.four;

public class Example {
    public static void main(String[] args) {
        Thread stopWatchThread = new Thread( new StopWatchThread());
        stopWatchThread.start();
    }
}
