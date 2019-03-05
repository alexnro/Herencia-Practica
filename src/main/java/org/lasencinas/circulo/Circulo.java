package org.lasencinas.circulo;

import org.lasencinas.figuraGeometrica.FiguraGeometrica;

import static java.lang.Math.PI;

public class Circulo extends FiguraGeometrica {

    private double radio = 0;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * Math.pow(getRadio(), 2);
    }
}
