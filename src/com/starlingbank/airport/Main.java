package com.starlingbank.airport;

public class Main {

    public static void main(String[] args) {
        float[] theVals = {10.0f, 20.0f, 15.0f};

        float sum1 = 0.0f;
        float sum2 = 0.0f;

        for(int i = 0; i < theVals.length; i++){
            sum1 += theVals[i];
        }

        for(float currentVal : theVals) {
            sum2 += currentVal;
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
