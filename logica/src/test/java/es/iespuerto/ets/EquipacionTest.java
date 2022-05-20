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
        artefacto=new Artefactos(1,"Ritual Antiguo de la Nobleza","Mazmorra Abisal","Danio de Habilidad Definitiva +20%,Despues de lanzar una habilidad Definitiva", "aumenta el ATQ de todo el equipo en un 20% durante 12s. Este efecto no puede acumularse");
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

    @Test
    void testSetPersonaje() {
        pj = new Personaje(1, "Gustavo", "Pyro", 1, pasivas, recursos);
        testeo.setPersonaje(pj);
        assertEquals(pj, testeo.getPersonaje());
    }

    @Test
    void testSetArma() {
        arma=new Armas(1,"Espada Blanca",454,"ATQ",69.0,1, testAscension);
        testeo.setArma(arma);
        assertEquals(arma, testeo.getArma());
    }

    @Test
    void testSetArtefacto() {
        artefacto=new Artefactos(2,"Emblema","Mazmorra Abisal", "+20% Recarga", "Bono de danio Equivalente al 25% de Recarga");
        testeo.setArtefactos(artefacto);
        assertEquals(artefacto, testeo.getArtefactos());
    }


}
