package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.*;

public class RecursosTest {
    Recursos testeoVacio = null;
    Recursos testeo = null;
    String[] rarezaRecurso={"NULL","Grilletes de Diente de Leon","Cadena de Diente de Leon","Esposas de Diente de Leon","Ideales de Diente de Leon"};


    @BeforeEach
    public void beforeEach(){
        testeo = new Recursos(1,rarezaRecurso,"Babosa");
        testeoVacio =new Recursos();
    }

    @Test
    void testLeerDatos() throws FileNotFoundException {
        testeoVacio.leerDatos();
        assertEquals(50, testeoVacio.getListaRecursos().size());
    }

    @Test
    void testGetListaRecursos() throws FileNotFoundException {
       testeoVacio.leerDatos();
       assertEquals(testeoVacio.listaRecursos, testeoVacio.getListaRecursos());
    }


    @Test
    void testGetCodigo() {
        assertEquals(1, testeo.getCodigo());
    }

    @Test
    void testGetEnemigo() {
        assertEquals("Babosa", testeo.getEnemigo());
    }


    @Test
    void testGetObjeto() {
        assertEquals(rarezaRecurso, testeo.getObjeto());
    }

    @Test
    void testSetCodigo() {
        testeo.setCodigo(2);
        assertEquals(2, testeo.getCodigo());
    }

    @Test
    void testSetEnemigo() {
        testeo.setEnemigo("Ladron");
        assertEquals("Ladron", testeo.getEnemigo());
    }

    @Test
    void testSetObjeto() {
        String[] rarezaTest={"NULL","Polen de neblina","Hierba brumosa","Estambre de hierba brumosa","NULL"};
        testeo.setObjeto(rarezaTest);
        assertEquals(rarezaTest, testeo.getObjeto());
    }
}
