package com.ruander.alakzatok;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlakzatokTest {
    FemAlakzat alakzat;

    public AlakzatokTest() {
    }

    @Test
    void testAbstract() throws NoSuchMethodException {
        Class<?> clazz = FemAlakzat.class;
        Assertions.assertTrue(Modifier.isAbstract(clazz.getModifiers()), "A 'FemAlakzat' osztály legyen abstract.");
        String pkg = clazz.getPackageName();
        Assertions.assertEquals("com.ruander.alakzatok", pkg, "a csomag 'com.ruander.alakzatok' legyen.");
        Method method = clazz.getDeclaredMethod("terfogat");
        boolean abs = Modifier.isAbstract(method.getModifiers());
        Assertions.assertTrue(abs, "a 'terfogat' metódus legyen abstract.");
    }

    @Test
    void testFajsuly() {
        Assertions.assertEquals(1.2, FemAlakzat.getFajsuly());
    }

    @Test
    void testGombTerfogat() {
        this.alakzat = new Gomb(1.0);
        Assertions.assertEquals(4.188, this.alakzat.terfogat(), 0.001);
    }

    @Test
    void testGombSuly() {
        this.alakzat = new Gomb(1.0);
        double d = this.alakzat.suly();
        Assertions.assertEquals(5.026, this.alakzat.suly(), 0.001);
    }

    @Test
    void testHasabTerfogat() {
        this.alakzat = new Hasab(1.0, 1.0, 1.0);
        Assertions.assertEquals(1.0, this.alakzat.terfogat(), 0.001);
    }

    @Test
    void testHasabSuly() {
        this.alakzat = new Hasab(1.0, 1.0, 1.0);
        Assertions.assertEquals(1.2, this.alakzat.suly(), 0.001);
    }

    @Test
    void testHasabParamSorrend() {
        Hasab hasab = new Hasab(1.0, 2.0, 3.0);
        Assertions.assertEquals(1.0, hasab.getA());
        Assertions.assertEquals(2.0, hasab.getB());
        Assertions.assertEquals(3.0, hasab.getM());
    }
}