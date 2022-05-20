package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class ArtefactosTest {
    Artefactos tArtefactos = null;
    Artefactos vacio = null;

    @BeforeEach
    public void BeforeEach() {
        tArtefactos = new Artefactos(1, "Emblema", "Mazmorra Abisal", "+20% Recarga",
                "Bono de danio Equivalente al 25% de Recarga");
        vacio=new Artefactos();
    }

    @Test
    void testLeerDatos() throws FileNotFoundException {
        vacio.leerDatos();
            assertEquals(9, vacio.getLista().size());
        }

    @Test 
    void testGetListaArmas() throws FileNotFoundException{
        vacio.leerDatos();
        assertEquals(vacio.artefacto, vacio.getLista());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Emblema", tArtefactos.getNombre());
    }

    @Test
    public void testGetPasiva2() {
        assertEquals("+20% Recarga", tArtefactos.getPasiva2());
    }

    @Test
    public void testGetPasiva4() {
        assertEquals("Bono de danio Equivalente al 25% de Recarga", tArtefactos.getPasiva4());
    }

    @Test
    public void testGetCodigo() {
        assertEquals(1, tArtefactos.getCodigo());
    }

    @Test
    public void testGetLocalizacion() {
        assertEquals("Mazmorra Abisal", tArtefactos.getLocalizacion());
    }

    @Test
    public void testSetNombre() {
        tArtefactos.setNombre("Verde Esmeralda");
        assertEquals("Verde Esmeralda", tArtefactos.getNombre());
    }

    @Test
    public void testSetPasiva2() {
        tArtefactos.setPasiva2("+15% Bono Anemo");
        assertEquals("+15% Bono Anemo", tArtefactos.getPasiva2());
    }

    @Test
    public void testSetPasiva4() {
        tArtefactos.setPasiva4("+60% Torbellinos");
        assertEquals("+60% Torbellinos", tArtefactos.getPasiva4());
    }

    @Test
    public void testSetCodigo() {
        tArtefactos.setCodigo(2);
        assertEquals(2, tArtefactos.getCodigo());
    }

    @Test
    public void testSetLocalizacion() {
        tArtefactos.setLocalizacion("Ciudad Inicial");
        assertEquals("Ciudad Inicial", tArtefactos.getLocalizacion());
    }
}
