package org.lasencinas.elipse;

import org.lasencinas.figuraGeometrica.FiguraGeometrica;

import static java.lang.Math.PI;

public class Elipse extends FiguraGeometrica {

    private double ejeMayor = 0;
    private double ejeMenor = 0;

    public Elipse() {
        super();
    }

    public Elipse(double ejeMayor, double ejeMenor) {
        super();
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public Elipse(String nombre, double ejeMayor, double ejeMenor) {
        super(nombre);
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public double getEjeMayor() {
        return this.ejeMayor;
    }

    public double getEjeMenor() {
        return this.ejeMenor;
    }

    @Override
    public double area() {
        return PI * getEjeMayor() * getEjeMenor();
    }
}
