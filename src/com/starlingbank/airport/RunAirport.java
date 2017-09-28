package com.starlingbank.airport;

public class RunAirport {

    public static void main(String[] args) {
        Airport airport1 = new Airport();
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();

        for(int i = 0; i <= 5; i++) {
            airport1.landPlane(plane1);
        }

        System.out.println(airport1.getPlanes());
    }
}
