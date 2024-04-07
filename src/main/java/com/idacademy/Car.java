package com.idacademy;

public class Car extends Transport {
    private int length;
    public final  int RESERVDRIVERS = 0;

    public Car(String models) {
        super(models);
    }
    public  Car(){

    }
    public Car(String models, int height, int weigh, int maxSpeed) {
        super(models, height, weigh, maxSpeed);
    }

    public Car(String models, int height, int weigh) {
        super(models, height, weigh);
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

       @Override
    public int drivers() {
         int quantityDrivers = DRIVER + RESERVDRIVERS;
        return  quantityDrivers;
    }
    @Override
    public void print() {
        System.out.println("метод из класса Car " + getMaxSpeed());
    }
    public void printinfo() {
        System.out.println("метод ничего не принимает ");
    }
    public String printinfo(String a) {
        System.out.println("метод принимает String  " + a);
        return a;
    }
    public int printinfo(int a) {
        System.out.println("метод принимает int  " + a);
        return a;
    }


    Engine engine;
     Radiator radiator;
    Battery battery;

    public Car(Engine engine, Battery battery, Radiator radiator) {
        this.engine = engine;
        this.battery = battery;
        this.radiator = radiator;
    }

    @Override
    public void CargoShipping() {
        System.out.println( "прокатим с комфортом на  автомобиле");
    }
}