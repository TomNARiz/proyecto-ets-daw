package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.*;

public class EstadisticasTest {
    Estadisticas testeo = null;
    Estadisticas testeoVacio = null;
    List<Estadisticas> testLista2 = new ArrayList<>();
    List<Estadisticas> testLista1 = new ArrayList<>();

    @BeforeEach
    public void beforeEach() throws FileNotFoundException  {
        testeo = new Estadisticas(1, 13226, 251, 876, 0, 100.0, 5.0, 50.0, 28.0, 1);
        testeoVacio =new Estadisticas();
    }

    @Test
    public void testGetEstadisticas() {
        Estadisticas testeoEstats=testeo.getEstadisticas(1);
        assertEquals(testeoEstats, testeo.getEstadisticas(1));
    }

    @Test
    void testLeerDatos() throws FileNotFoundException {
        testeoVacio.leerDatos();
        assertEquals(11, testeoVacio.getList().size());
    }

    @Test 
    void testGetListaArmas() throws FileNotFoundException{
        testeoVacio.leerDatos();
        assertEquals(testeoVacio.stats, testeoVacio.getList());
    }

    @Test
    public void testGetAtqbase() {
        assertEquals(251, testeo.getAtqbase());
    }

    @Test
    public void testGetBonoelemnt() {
        assertEquals(28.0, testeo.getBonoelemnt());
    }

    @Test
    public void testGetCodigo() {
        assertEquals(1, testeo.getCodigo());
    }

    @Test
    public void testGetCodigoPersonaje() {
        assertEquals(1, testeo.getCodigoPersonaje());
    }

    @Test
    public void testGetDefbase() {
        assertEquals(876, testeo.getDefbase());
    }

    @Test
    public void testGetDnCrit() {
        assertEquals(50.0, testeo.getDnCrit());
    }

    @Test
    public void testGetMaestria() {
        assertEquals(0, testeo.getMaestria());
    }

    @Test
    public void testGetProbCrit() {
        assertEquals(5.0, testeo.getProbCrit());
    }

    @Test
    public void testGetRecarga() {
        assertEquals(100.0, testeo.getRecarga());
    }

    @Test
    public void testGetVidabase() {
        assertEquals(13226, testeo.getVidabase());
    }

    @Test
    public void testSetAtqbase() {
        testeo.setAtqbase(200);
        assertEquals(200, testeo.getAtqbase());
    }

    @Test
    public void testSetBonoelemnt() {
        testeo.setBonoelemnt(50.0);
        assertEquals(50.0, testeo.getBonoelemnt());
    }

    @Test
    public void testSetCodigo() {
        testeo.setCodigo(2);
        assertEquals(2, testeo.getCodigo());
    }

    @Test
    public void testSetCodigoPersonaje() {
        testeo.setCodigoPersonaje(2);
        assertEquals(2, testeo.getCodigoPersonaje());
    }

    @Test
    public void testSetDefbase() {
        testeo.setDefbase(900);
        assertEquals(900, testeo.getDefbase());
    }

    @Test
    public void testSetDnCrit() {
        testeo.setDnCrit(100.0);
        assertEquals(100.0, testeo.getDnCrit());
    }

    @Test
    public void testSetMaestria() {
        testeo.setMaestria(234);
        assertEquals(234, testeo.getMaestria());
    }

    @Test
    public void testSetProbCrit() {
        testeo.setProbCrit(47.5);
        assertEquals(47.5, testeo.getProbCrit());
    }

    @Test
    public void testSetRecarga() {
        testeo.setRecarga(236.52);
        assertEquals(236.52, testeo.getRecarga());
    }

    @Test
    public void testSetVidabase() {
        testeo.setVidabase(20502);
        assertEquals(20502, testeo.getVidabase());
    }
}
