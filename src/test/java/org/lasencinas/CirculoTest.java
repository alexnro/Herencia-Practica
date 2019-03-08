package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.circulo.Circulo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CirculoTest {

    private Circulo circuloConstructorSuper = null;
    private Circulo circuloConstructorLocal = null;
    private Circulo circuloConstructorVacio = null;

    @Before
    public void init() {
        circuloConstructorSuper = new Circulo(0);
        circuloConstructorLocal = new Circulo("círculo", 0);
        circuloConstructorVacio = new Circulo();
    }

    @Test
    public void constructorSuperclaseTest() {
        assertEquals(0, circuloConstructorSuper.area(), 0);
        assertEquals("Desconocido", circuloConstructorSuper.getNombre());

        circuloConstructorSuper.setNombre("círculo");
        circuloConstructorSuper.setRadio(6);
        assertEquals("círculo", circuloConstructorSuper.getNombre());
        assertEquals(113.1, circuloConstructorSuper.area(), 0.1);
    }

    @Test
    public void constructorLocalTest() {
        assertEquals("círculo", circuloConstructorLocal.getNombre());

        circuloConstructorLocal.setNombre("nombre");
        assertEquals("nombre", circuloConstructorLocal.getNombre());
    }

    @Test
    public void constructorVacioTest() {
        assertEquals("Desconocido", circuloConstructorVacio.getNombre());
    }
}
