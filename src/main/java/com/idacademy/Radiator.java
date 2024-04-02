package com.idacademy;

public class Radiator {
    private int rotationSpeed = 0;

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public Radiator(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }
}
