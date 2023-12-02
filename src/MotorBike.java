package com.seojun.one;

public class MotorBike {
    private int speed;

    MotorBike() {   // 기본값 생성자
        this(5);
    }

    MotorBike(int speed) {  // 생성자
        setSpeed(this.speed = speed);
    }

    public int getSpeed() { // 캡슐화, Getter
        return speed;
    }

    public void setSpeed(int speed) {   // 캡슐화, Setter
        if (speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    void start() {
        System.out.println("Bike Started");
    }
}
