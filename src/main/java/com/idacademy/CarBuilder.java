package com.idacademy;

public class CarBuilder {
    private String models;
    private int height;
    private int weigh;
    private int maxSpeed;
    private Engine engine;
    private Radiator radiator;
    private Battery battery;

    public CarBuilder setModels(String models) {
        this.models = models;
        return this;
    }

    public CarBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public CarBuilder setWeigh(int weigh) {
        this.weigh = weigh;
        return this;
    }

    public CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setRadiator(Radiator radiator) {
        this.radiator = radiator;
        return this;
    }

    public CarBuilder setBattery(Battery battery) {
        this.battery = battery;
        return this;
    }

    public Car createCar() {
        return new Car(models);
    }
}