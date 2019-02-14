package com.Concurenccy.five;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeaSeat() { //could be added before void (synchronized)
        System.out.println("");
        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("taking a seat...");

                availableSeats--;

                System.out.println("free seats left: " + availableSeats);
            } else {
                System.out.println("There are no available seats");
            }
        }
    }
}
