package es.iespuerto.ets;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.*;

public class EquipacionTest {
    Artefactos artefacto=null;
    Personaje pj = null;
    Equipacion  testeo=null;
    Armas arma=null;
    Integer[] pasivas = { 1, 2, 3 };
    Integer[] recursos = { 19, 29, 38, 12 };
    Integer[] testAscension={3,43,42};

    @BeforeEach
    public void beforeEach() throws FileNotFoundException{
        artefacto=new Artefactos(1,"Ritual Antiguo de la Nobleza","Mazmorra Abisal","Danio de Habilidad Definitiva +20%,Despues de lanzar una habilidad Definitiva", "aumenta el ATQ de todo el equipo en un 20% durante 12s. Este efecto no puede acumularse",64.8);
        pj = new Personaje(1, "Albedo", "Geo", 1, pasivas, recursos);
        arma=new Armas(1,"Huso de Cinabrio",454,"DEF",69.0,1, testAscension);
        testeo=new Equipacion(pj, arma, artefacto);
        
    }

    @Test
    void testGetArma() {
        assertEquals(arma, testeo.getArma());

    }

    @Test
    void testGetArtefactos() {
        assertEquals(artefacto, testeo.getArtefactos());

    }

    @Test
    void testGetPersonaje() {
        assertEquals(pj, testeo.getPersonaje());
    }

}
