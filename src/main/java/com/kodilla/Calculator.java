package com.kodilla;

public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double addAtoB() {
        return a+b;
    }

    public double subtractBfromA() {
        return b-a;
    }
}
