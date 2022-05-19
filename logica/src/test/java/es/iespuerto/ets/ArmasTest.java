package es.iespuerto.ets;


import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.*;


public class ArmasTest {
        Armas testeo=null;
        Integer[] testAscension={3,43,42};
        List<Armas> testLista2 = new ArrayList<>();
        List<Armas> testLista1 = new ArrayList<>();
       
    @BeforeEach
    public void beforeEach() throws FileNotFoundException{
        testeo=new Armas(1,"Huso de Cinabrio",454,"DEF",69.0,1, testAscension);
        String linea;
        String[] palabrasLinea;
        Scanner bdArmas = new Scanner(new File("H:\\1º DAW\\Entorno Desarrollo\\CalcImpactWin\\proyecto-ets-daw\\logica\\src\\main\\java\\es\\iespuerto\\ets\\Datos\\Armas.txt"));
        bdArmas.nextLine();    
        while (bdArmas.hasNextLine()) {
                linea = bdArmas.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                Integer atq = Integer.parseInt(palabrasLinea[2]);
                double subestat = Double.parseDouble(palabrasLinea[4]);
                Integer pasivas = Integer.parseInt(palabrasLinea[5]);
                Integer[] recursos ={Integer.parseInt(palabrasLinea[6]),Integer.parseInt(palabrasLinea[7]),Integer.parseInt(palabrasLinea[8])};
                Armas datos = new Armas(id, palabrasLinea[1], atq, palabrasLinea[3], subestat, pasivas, recursos);
                testLista1.add(datos);
                testLista2.add(datos);
            }
            bdArmas.close();
        
    }
    
    @Test
    public void testLeerDatos() {
        assertEquals(testLista1.size(),testLista2.size());
    }

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
