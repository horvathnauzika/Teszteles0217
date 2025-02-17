package com.ruander;

import com.ruander.alakzatok.FemAlakzat;
import com.ruander.alakzatok.Gomb;
import com.ruander.alakzatok.Hasab;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProgramTest {
    static FemAlakzatokProgram program;

    ProgramTest() {
    }

    @BeforeAll
    static void programIni() {
        Class<?> clazz = FemAlakzatokProgram.class;
        String pkg = clazz.getPackageName();
        Assertions.assertEquals("com.ruander", pkg, "a csomag 'com.ruander' legyen.");
        program = new FemAlakzatokProgram();
        program.ujAlakzat(new Gomb(1.0));
        program.ujAlakzat(new Hasab(1.0, 1.0, 1.0));
    }

    @Test
    void testLista() {
        ArrayList<FemAlakzat> lista = program.getLista();
        Assertions.assertEquals(2, lista.size());
        lista.add(new Gomb(1.0));
        Assertions.assertEquals(2, program.getLista().size());
    }

    @Test
    void testSzamolasok() {
        Assertions.assertEquals(6.22, program.osszSuly(), 0.01);
        Assertions.assertEquals(5.02, program.gombokOsszSuly(), 0.01);
        Hasab hasab = new Hasab(1.0, 1.0, 1.0);
        Assertions.assertEquals(hasab.terfogat(), program.minV().terfogat());
        Gomb gomb = new Gomb(1.0);
        Assertions.assertEquals(gomb.terfogat(), program.maxV().terfogat());
    }
}