package com.idacademy;

import interfaces.Alltransport;

public class HorseCarriege implements Alltransport {
    private int horses;

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public HorseCarriege(int horses) {
        this.horses = horses;
    }

    @Override
    public void CargoShipping() {
        System.out.println(" перевезем ваши вещи в упряжке из " +  horses + " лошадей");
    }
}
