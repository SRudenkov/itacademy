package com.idacademy;

public class Bus extends Transport {
    public int passengers;
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public Bus(String models, int height, int weigh, int maxSpeed) {
        super(models, height, weigh, maxSpeed);
    }


    @Override
    public int drivers() {
        int quantityDrivers = DRIVER + 1;
        return  quantityDrivers;

    }
}
