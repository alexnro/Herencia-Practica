package org.lasencinas.rectangulo;

import org.lasencinas.figuraGeometrica.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    private double altura = 0;
    private double anchura = 0;

    public Rectangulo() {
        super();
    }

    public Rectangulo(double altura, double anchura) {
        super();
        this.altura = altura;
        this.anchura = anchura;
    }

    public Rectangulo(String nombre, double altura, double anchura) {
        super(nombre);
        this.altura = altura;
        this.anchura = anchura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getAnchura() {
        return this.anchura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    @Override
    public double area() {
        return getAltura() * getAnchura();
    }
}
