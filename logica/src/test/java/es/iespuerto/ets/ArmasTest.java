package es.iespuerto.ets;


import static org.junit.jupiter.api.Assertions.assertEquals;
/** 
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.FileNotFoundException;
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArmasTest {
        Armas testeo=null;
        Integer[] testAscension={3,43,42};
       
    @BeforeEach
    public void beforeEach(){

        testeo=new Armas(1,"Huso de Cinabrio",454,"DEF",69.0,1, testAscension);
        
    }
    
    /** 
    @Test
    void testLeerDatos() {
        Exception exepcion1=assertThrows(FileNotFoundException.class, ()->testeo.leerDatos());
        assertTrue(exepcion1.getMessage().contains("org.opentest4j.AssertionFailedError: Expected java.io.FileNotFoundException to be thrown, but nothing was thrown."));
    }
    */

    @Test
    void testGetAtqbase() {
        assertEquals(454, testeo.getAtqbase());
    }

    @Test
    void testGetCodigo() {
        assertEquals(1, testeo.getCodigo());
    }

    @Test
    void testGetNombre() {
        assertEquals("Huso de Cinabrio", testeo.getNombre());
    }

    @Test
    void testGetPasiva() {
        assertEquals(1, testeo.getPasiva());
    }

    @Test
    void testGetSubestadistica() {
        assertEquals(69.0, testeo.getSubestadistica());
    }

    @Test
    void testGetTipoSubestadistica() {
        assertEquals("DEF", testeo.getTipoSubestadistica());
    }

    @Test
    void testGetrecursosAscencion() {
        assertEquals(testAscension, testeo.getrecursosAscencion());
    }


    @Test
    void testPerdirRecursos() {
       Integer[] recursosDevueltos=testeo.perdirRecursos("Huso de Cinabrio");
        assertEquals(recursosDevueltos, testeo.getrecursosAscencion());

    }

    @Test
    void testSetAtqbase() {
        testeo.setAtqbase(500);
        assertEquals(500, testeo.getAtqbase());
    }

    @Test
    void testSetCodigo() {
        testeo.setCodigo(2);
        assertEquals(2, testeo.getCodigo());

    }

    @Test
    void testSetNombre() {
        testeo.setNombre("Gustavo");
        assertEquals("Gustavo", testeo.getNombre());
    }

    @Test
    void testSetPasiva() {
        testeo.setPasiva(2);
        assertEquals(2, testeo.getPasiva());
    }

    @Test
    void testSetSubestadistica() {
        testeo.setSubestadistica(88.0);
        assertEquals(88.0, testeo.getSubestadistica());
    }

    @Test
    void testSetTipoSubestadistica() {
        testeo.setTipoSubestadistica("ATQ");
        assertEquals("ATQ", testeo.getTipoSubestadistica());
    }

    @Test
    void testSetrecursosAscencion() {
        Integer[] nuevosRecursos={2,5,12};
        testeo.setrecursosAscencion(nuevosRecursos);
        assertEquals(nuevosRecursos, testeo.getrecursosAscencion());

    }
}
