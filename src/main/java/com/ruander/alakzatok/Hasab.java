package com.ruander.alakzatok;

public class Hasab extends FemAlakzat {
    public double a,b,m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    @Override
    public double terfogat() {
        double alap=a*b;
        return alap*m;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }

    public double suly() {
        return 1.2;
    }
}
