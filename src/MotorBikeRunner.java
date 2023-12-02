package com.seojun.one;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(50);

        System.out.println(ducati.getSpeed());
    }
}
