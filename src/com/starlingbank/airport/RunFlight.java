package com.starlingbank.airport;

public class RunFlight {

    public static void main(String[] args) {
        Flight flight1 = new Flight();
        flight1.add1Passenger();
        System.out.println(flight1.getPassengers());

    }
}
