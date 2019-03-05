package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.rectangulo.Rectangulo;

public class RectanguloTest {

    Rectangulo rectanguloConstructorSuper = null;
    Rectangulo rectanguloConstructorLocal = null;
    Rectangulo rectanguloConstructorVacioSuper = null;

    @Before
    public void init() {
        rectanguloConstructorSuper = new Rectangulo(0, 0);
        rectanguloConstructorLocal = new Rectangulo("rectangulo", 0, 0);
        rectanguloConstructorVacioSuper = new Rectangulo();
    }

    @Test
    public void constructorSuperTest() {

    }

}
