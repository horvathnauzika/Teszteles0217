package com.ruander.alakzatok;

public class Gomb extends FemAlakzat {
    private double r;

    public Gomb(double r) {
        this.r=r;
    }

    @Override
    public double terfogat() {
        return (4 * Math.pow(r,3) * Math.PI) / 3;
    }
}
