package org.example;

public class EntradaSaida {
    private double n1;
    private double n2;
    private double p1;
    private double p2;

    public EntradaSaida(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public EntradaSaida(double n1, double n2, double p1, double p2) {
        this.n1 = n1;
        this.n2 = n2;
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
}
