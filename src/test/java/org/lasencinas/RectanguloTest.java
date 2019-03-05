package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.lasencinas.rectangulo.Rectangulo;

public class RectanguloTest {

    private Rectangulo rectanguloConstructorSuper = null;
    private Rectangulo rectanguloConstructorLocal = null;
    private Rectangulo rectanguloConstructorVacioSuper = null;

    @Before
    public void init() {
        rectanguloConstructorSuper = new Rectangulo(0, 0);
        rectanguloConstructorLocal = new Rectangulo("rectangulo", 0, 0);
        rectanguloConstructorVacioSuper = new Rectangulo();
    }

    @Test
    public void constructorSuperTest() {
        rectanguloConstructorSuper.setAltura(2);
        rectanguloConstructorSuper.setAnchura(6);
        assertEquals(12, rectanguloConstructorSuper.area(), 0);

        rectanguloConstructorSuper.setAltura(3);
        rectanguloConstructorSuper.setAnchura(20.2);
        assertEquals(60.6, rectanguloConstructorSuper.area(), 0.1);

        assertEquals("Desconocido", rectanguloConstructorSuper.getNombre());
        rectanguloConstructorSuper.setNombre("rectangulo sale");
        assertEquals("rectangulo sale", rectanguloConstructorSuper.getNombre());
    }

    @Test
    public void constructorLocalTest() {
        rectanguloConstructorLocal.setAltura(6);
        rectanguloConstructorLocal.setAnchura(8.3);
        assertEquals(49.8, rectanguloConstructorLocal.area(), 0.1);

        rectanguloConstructorLocal.setAltura(2);
        rectanguloConstructorLocal.setAnchura(5);
        assertEquals(10, rectanguloConstructorLocal.area(), 0);

        assertEquals("rectangulo", rectanguloConstructorLocal.getNombre());
        rectanguloConstructorLocal.setNombre("rectangulo sale");
        assertEquals("rectangulo sale", rectanguloConstructorLocal.getNombre());
    }

    @Test
    public void constructorVacioSuperTest() {
        assertEquals(0, rectanguloConstructorVacioSuper.area(), 0);
        assertEquals("Desconocido", rectanguloConstructorVacioSuper.getNombre());

        rectanguloConstructorVacioSuper.setNombre("rectangulo sale");
        assertEquals("rectangulo sale", rectanguloConstructorVacioSuper.getNombre());

        assertEquals(0, rectanguloConstructorVacioSuper.area(), 0);
    }
}
