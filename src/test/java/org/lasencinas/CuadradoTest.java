package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.cuadrado.Cuadrado;

import static org.junit.Assert.assertEquals;

public class CuadradoTest {

    private Cuadrado cuadradoConstructorSuper = null;
    private Cuadrado cuadradoConstructorLocal = null;
    private Cuadrado cuadradoConstructorVacio = null;

    @Before
    public void init() {
        cuadradoConstructorSuper = new Cuadrado(0);
        cuadradoConstructorLocal = new Cuadrado("cuadrado", 0);
        cuadradoConstructorVacio = new Cuadrado();
    }

    @Test
    public void constructorSuperclaseTest() {
        assertEquals(0, cuadradoConstructorSuper.area(), 0);
        assertEquals("Desconocido", cuadradoConstructorSuper.getNombre());

        cuadradoConstructorSuper.setNombre("cuadrado");
        cuadradoConstructorSuper.setLado(6);
        assertEquals("cuadrado", cuadradoConstructorSuper.getNombre());
        assertEquals(36, cuadradoConstructorSuper.area(), 0);
    }

    @Test
    public void constructorLocalTest() {
        assertEquals("cuadrado", cuadradoConstructorLocal.getNombre());

        cuadradoConstructorLocal.setNombre("nombre");
        assertEquals("nombre", cuadradoConstructorLocal.getNombre());
    }

    @Test
    public void constructorVacioTest() {
        assertEquals("Desconocido", cuadradoConstructorVacio.getNombre());
    }
}
