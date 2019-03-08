package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.elipse.Elipse;

import static org.junit.Assert.assertEquals;

public class ElipseTest {

    private Elipse elipseConstructorSuper = null;
    private Elipse elipseConstructorLocal = null;
    private Elipse elipseConstructorVacio = null;

    @Before
    public void init() {
        elipseConstructorSuper = new Elipse(0, 0);
        elipseConstructorLocal = new Elipse("elipse", 0, 0);
        elipseConstructorVacio = new Elipse();
    }

    @Test
    public void constructorSuperclaseTest() {
        assertEquals(0, elipseConstructorSuper.area(), 0);
        assertEquals("Desconocido", elipseConstructorSuper.getNombre());

        elipseConstructorSuper.setNombre("elipse");
        elipseConstructorSuper.setEjeMayor(6);
        elipseConstructorSuper.setEjeMenor(4);
        assertEquals("elipse", elipseConstructorSuper.getNombre());
        assertEquals(75.3, elipseConstructorSuper.area(), 0.1);
    }

    @Test
    public void constructorLocalTest() {
        assertEquals("elipse", elipseConstructorLocal.getNombre());

        elipseConstructorLocal.setNombre("nombre");
        assertEquals("nombre", elipseConstructorLocal.getNombre());
    }

    @Test
    public void constructorVacioTest() {
        assertEquals("Desconocido", elipseConstructorVacio.getNombre());
    }
}
