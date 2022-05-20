package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PasivaTest {
    Pasiva tPasiva=null;
    Pasiva vacio=null;


    @BeforeEach
    public void BeforeEach(){
        tPasiva=new Pasiva("Uno", "Dos", "Tres");
        vacio=new Pasiva();
    }

    @Test
    public void testGetBono() {
        assertEquals("Tres", tPasiva.getBono());
    }

    @Test
    public void testGetDescripcion() {
        assertEquals("Dos", tPasiva.getDescripcion());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Uno", tPasiva.getNombre());
    }

    @Test
    public void testSetBono() {
        tPasiva.setBono("cuatro");
        assertEquals("cuatro", tPasiva.getBono());
    }

    @Test
    public void testSetDescripcion() {
        tPasiva.setDescripcion("cuatro");
        assertEquals("cuatro", tPasiva.getDescripcion());
    }

    @Test
    public void testSetNombre() {
        tPasiva.setNombre("cuatro");
        assertEquals("cuatro", tPasiva.getNombre());
    }
}
