package com.idacademy;

public class Integralcheme extends Scheme {
    private  String varintshem;

    public String getVarintshem() {
        return varintshem;
    }

    public void setVarintshem(String varintshem) {
        this.varintshem = varintshem;
    }

    public Integralcheme(String variableTransisor, String variableScheme, String varintshem) {
        super(variableTransisor, variableScheme);
        this.varintshem = varintshem;
        System.out.println(varintshem + "  схема дорога к серверам " +  getVariableScheme()+ " схема позволяет создать устройства"+ getVariableTransisor() + " транзистор основа электроники");
    }
}
