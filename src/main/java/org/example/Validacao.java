package org.example;

public class Validacao {
    public double nota;

    public Validacao(double nota) {
        this.nota = nota;
    }

    public boolean validaNota(double nota){
        return nota >= 0 && nota <= 10;
    }

    public boolean validaPonto(double ponto){
        return ponto >= 0 && ponto <= 10;
    }
}
