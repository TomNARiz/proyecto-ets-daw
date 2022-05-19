package es.iespuerto.ets;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ArtefactosTest {
    Artefactos tArtefactos=null;

    @Before
    public void BeforeEach(){
        tArtefactos=new Artefactos("Emblema", "+20% Recarga", "Bono de danio Equivalente al 25% de Recarga", 46.6);
    }

    @Test
    public void testGetEstatbase() {
        assertEquals(46.6, tArtefactos.getEstatbase());
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
        assertEquals("Bono de danio Equivalente al 25% de Recarga", tArtefactos.getPasiva4()());
    }

    @Test
    public void testSetEstatbase() {
        tArtefactos.setEstatbase(4780.0);
        assertEquals(4780.0, tArtefactos.getEstatbase());
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
}
