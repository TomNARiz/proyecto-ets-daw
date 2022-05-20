package es.iespuerto.ets;

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Personaje listaPersonajes = new Personaje();
        Artefactos listaArtefactos = new Artefactos();
        Recursos listaRecurso = new Recursos();
        Estadisticas estadisticas = new Estadisticas();
        Armas listaArma = new Armas();
        listaPersonajes.leerDatos();
        listaArtefactos.leerDatos();
        listaRecurso.leerDatos();
        estadisticas.leerDatos();
        listaArma.leerDatos();

        System.out.println("Bienvenido a CalcImpact:");
        System.out.println("Elija una de las siguientes opciones \n");
        System.out.println("Menu");
        System.out.println("---------------------------");
        System.out.println("1. Lista de recursos");
        System.out.println("---------------------------");
        System.out.println("2. Equipacion de personajes");
        System.out.println("---------------------------");
        Scanner teclado = new Scanner(System.in); 
            Integer opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Selecciona que lista de recursos quieres:");
                    System.out.println("---------------------------");
                    System.out.println("1. Arma");
                    System.out.println("---------------------------");
                    System.out.println("2. Personaje");
                    System.out.println("---------------------------");
                    break;
                case 2:
                    System.out.println("Selecciona el personaje al cual quieres equipar:");
                    String personaje = teclado.nextLine();
                    for (int i = 0; i < listaPersonajes.personajes.size(); i++) {
                        Personaje personajeDeLaLista = listaPersonajes.personajes.get(i);
                        Integer codigoPersonaje = listaPersonajes.personajes.get(i).getCodigo();
                        if (personajeDeLaLista.getNombre().equals(personaje)) {
                            System.out.printf(
                                    "Nombre: %s %n Elemento: %s %n Estadísticas: %n Vida: %d %n Ataque: %d %n Defensa: %d %n Maestria Elemental: %d %n Recarga de Energia: %d %n Probabilidad de Critico: %d %n Daño Critico: %d %n Bono Elemental: %d %n",
                                    personajeDeLaLista.getNombre(), personajeDeLaLista.getElemento(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getVidabase(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getAtqbase(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getDefbase(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getMaestria(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getRecarga(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getProbCrit(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getDnCrit(),
                                    estadisticas.getEstadisticas(codigoPersonaje).getBonoelemnt());

                        }

                    }
                    break;
                default:
                    break;
                
            }
            teclado.close();
        }
    }
