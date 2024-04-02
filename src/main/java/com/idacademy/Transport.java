package com.idacademy;

public abstract class Transport {
    private String models;
    private int  height;
    private int weigh;
    private int maxSpeed;
    public final int DRIVER = 1;

    public void print() {
        System.out.println("метод из родительского класса " + getMaxSpeed());

    }
    public Transport(){

    }
    public Transport(String models) {
        this.models = models;
    }

    public Transport(String models, int height, int weigh, int maxSpeed) {
        this.models = models;
        this.height = height;
        this.weigh = weigh;
        this.maxSpeed = maxSpeed;
    }
    public Transport(String models, int height, int weigh) {
        this.models = models;
        this.height = height;
        this.weigh = weigh;
    }
    public String getModels() {
        return models;
    }
    public void setModels(String models) {
        this.models = models;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeigh() {
        return weigh;
    }
    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract int drivers();
}
