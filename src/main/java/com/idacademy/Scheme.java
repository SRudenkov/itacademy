package com.idacademy;

public class Scheme extends Transistor{

    private String variableScheme;

    public String getVariableScheme() {
        return variableScheme;
    }

    public void setVariableScheme(String variableScheme) {
        this.variableScheme = variableScheme;
    }

    public Scheme(String variableTransisor, String variableScheme) {
        super(variableTransisor);
        this.variableScheme = variableScheme;

    }
}
