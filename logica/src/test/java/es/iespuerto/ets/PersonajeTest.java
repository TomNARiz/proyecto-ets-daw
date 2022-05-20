package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.*;

public class PersonajeTest {
    Personaje testeo = null;
    Personaje testeoVacio = null;
    Integer[] pasivas = { 1, 2, 3 };
    Integer[] recursos = { 19, 29, 38, 12 };

    @BeforeEach
    public void beforeEach() {
        testeo = new Personaje(1, "Albedo", "Geo", 1, pasivas, recursos);
        testeoVacio= new Personaje();
    }

    @Test
    void testLeerDatos() throws FileNotFoundException {
            testeoVacio.leerDatos();
            assertEquals(13, testeoVacio.getList().size());
        }

    @Test 
    void testGetListaArmas() throws FileNotFoundException{
        testeoVacio.leerDatos();
        assertEquals(testeoVacio.personajes, testeoVacio.getList());
    }


    @Test
    void testGetAscension() {
        assertEquals(recursos, testeo.getAscension());

    }

    @Test
    void testGetCodigo() {
        assertEquals(1, testeo.getCodigo());
    }

    @Test
    void testGetElemento() {
        assertEquals("Geo", testeo.getElemento());
    }

    @Test
    void testGetEstadisticas() {
        assertEquals(1, testeo.getEstadisticas());
    }

    @Test
    void testGetNombre() {
        assertEquals("Albedo", testeo.getNombre());
    }

    @Test
    void testGetPasivas() {
        assertEquals(pasivas, testeo.getPasivas());
    }

    @Test
    void testSetAscension() {
        Integer[] nuevosRecursos = { 2, 5, 12, 20 };
        testeo.setAscension(nuevosRecursos);
        assertEquals(nuevosRecursos, testeo.getAscension());
    }

    @Test
    void testSetCodigo() {
        testeo.setCodigo(2);
        assertEquals(2, testeo.getCodigo());
    }

    @Test
    void testSetElemento() {
        testeo.setElemento("Pyro");
        assertEquals("Pyro", testeo.getElemento());
    }

    @Test
    void testSetEstadisticas() {
        testeo.setEstadisticas(2);
        assertEquals(2, testeo.getEstadisticas());
    }

    @Test
    void testSetNombre() {
        testeo.setNombre("Gustavo");
        assertEquals("Gustavo", testeo.getNombre());
    }

    @Test
    void testSetPasivas() {
        Integer[] nuevasPasivas = { 1, 3, 22 };
        testeo.setPasivas(nuevasPasivas);
        assertEquals(nuevasPasivas, testeo.getPasivas());
    }
}
