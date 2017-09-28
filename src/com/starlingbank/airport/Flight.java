package com.starlingbank.airport;

public class Flight {
   private int passengers;
   private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
        if(passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    public int getPassengers() {
        return passengers;
    }

    private void handleTooMany() {
        System.out.println("Too many");
    }


}

