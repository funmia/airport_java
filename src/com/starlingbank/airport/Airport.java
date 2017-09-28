package com.starlingbank.airport;

import java.util.*;

public class Airport {
    private List<Plane> planes;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    Airport() {
        this.planes = new ArrayList();
        this.capacity = DEFAULT_CAPACITY;
    }

    void landPlane(Plane plane) {
        if (full()) {
            throw new ArithmeticException("The airport is full!");
        } else {
            planes.add(plane);

        }
    }

    void takeOff(Plane plane) {
        if(empty()) {
            throw new ArithmeticException("The airport is empty!");
        }else {
            planes.remove(plane);
        }
    }

    List getPlanes() {
        return planes;
    }

   private boolean full() {
        return planes.size() > DEFAULT_CAPACITY;
    }

    private boolean empty() {
        return planes.size() == 0;
    }


}
