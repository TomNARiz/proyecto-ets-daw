package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.*;

public class PersonajeTest {
    Personaje testeo = null;
    Integer[] pasivas = { 1, 2, 3 };
    Integer[] recursos = { 19, 29, 38, 12 };
    List<Personaje> testLista2 = new ArrayList<>();
    List<Personaje> testLista1 = new ArrayList<>();

    @BeforeEach
    public void beforeEach() throws FileNotFoundException {
        testeo = new Personaje(1, "Albedo", "Geo", 1, pasivas, recursos);
        String linea;
        String[] palabrasLinea;
        Scanner bdPersonajes = new Scanner(new File(
                "H:\\1º DAW\\Entorno Desarrollo\\CalcImpactWin\\proyecto-ets-daw\\logica\\src\\test\\java\\es\\iespuerto\\ets\\Datos\\Personajes.txt"));
        bdPersonajes.nextLine();
        while (bdPersonajes.hasNextLine()) {
            linea = bdPersonajes.nextLine();
            palabrasLinea = linea.split(";");
            Integer id = Integer.parseInt(palabrasLinea[0]);
            Integer stats = Integer.parseInt(palabrasLinea[3]);
            Integer pasiva1 =  Integer.parseInt(palabrasLinea[4]);
            Integer pasiva2 =   Integer.parseInt(palabrasLinea[5]);
            Integer[] pasivas = {pasiva1,pasiva2};
            Integer[] ascensionPj = { Integer.parseInt(palabrasLinea[7]), Integer.parseInt(palabrasLinea[8]),
                    Integer.parseInt(palabrasLinea[9]) };
            Personaje datos = new Personaje(id, palabrasLinea[1], palabrasLinea[2], stats, pasivas,
                    ascensionPj);
            testLista1.add(datos);
            testLista2.add(datos);
        }
        bdPersonajes.close();
    }

    @Test
    public void testLeerDatos() {
        assertEquals(testLista1.size(), testLista2.size());
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
