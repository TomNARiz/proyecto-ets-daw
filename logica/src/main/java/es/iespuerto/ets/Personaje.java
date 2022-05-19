package es.iespuerto.ets;

import java.io.*;
import java.util.*;

/**
 * Esta clase almacena los personajes, sus habilidades, elementos y recursos que
 * necesita
 * 
 * @author Victor Manuel Cabrera Abreu
 * @see Estadisticas
 * @see Recursos
 */
public class Personaje {
    public List<Personaje> personajes = new ArrayList<>();
    private Integer codigo;
    private String nombre;
    private String elemento;
    private Integer estadisticas;
    private Integer[] pasivas=new Integer[3];
    private Integer[] ascension=new Integer[4];

    /**
     * Metodo constructor vacio
     */
    public Personaje() {
    }

    /**
     * Metodo constructor parametrizador
     * 
     * @param codigo       ID del personaje
     * @param nombre       Nombre del personaje
     * @param elemento     Elemento del personaje
     * @param estadisticas Estadisticas del personaje
     * @param talento      Habilidades del personaje
     * @param ascension    Recursos que necesita para subir de nivel
     */
    public Personaje(Integer codigo, String nombre, String elemento, Integer estadisticas,
            Integer[] pasivas, Integer[] ascension) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.elemento = elemento;
        this.estadisticas = estadisticas;
        this.pasivas = pasivas;
        this.ascension = ascension;
    }

    /**
     * Metodo que devuelve el codigo del recurso
     * 
     * @return Codigo del recurso
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Metodo que establece un codigo
     * 
     * @param codigo codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo que regresa el nombre del personaje
     * 
     * @return Regresa el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre del personaje
     * 
     * @param nombre Nombre del personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el elemento del personaje
     * 
     * @return Regresa el elemento del personaje
     */
    public String getElemento() {
        return elemento;
    }

    /**
     * Metodo que establece el elemento del personaje
     * 
     * @param nombre Elemento del personaje
     */
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    /**
     * Metodo que regresa las estadisticas del personaje
     * 
     * @return Regresa las estadisticas del personaje
     */
    public Integer getEstadisticas() {
        return estadisticas;
    }

    /**
     * Metodo que establece las estadisticas del personaje
     * 
     * @param nombre Estadisticas del personaje
     */
    public void setEstadisticas(Integer estadisticas) {
        this.estadisticas = estadisticas;
    }

    /**
     * Metodo que regresa los recursos necesarios del personaje
     * 
     * @return Regresa los recursos necesarios del personaje
     */
    public Integer[] getAscension() {
        return ascension;
    }

    /**
     * Metodo que establece los recursos necesarios para subirlo de nivel
     * 
     * @param nombre Recursos necesarios
     */
    public void setAscension(Integer[] ascension) {
        this.ascension = ascension;
    }

    /**
     * Metodo que devuelve las pasivas
     * 
     * @return
     */
    public Integer[] getPasivas() {
        return pasivas;
    }

    /**
     * Metodo que establece nuvas pasivas para el personaje
     * 
     * @param pasivas Pasivas
     */
    public void setPasivas(Integer[] pasivas) {
        this.pasivas = pasivas;
    }

    /**
     * Metodo que lee y aniade la base de datos de Personajes mediante un fichero.
     */
    public void leerDatos() throws FileNotFoundException {
        String linea;
        String[] palabrasLinea;
        Scanner bdPersonajes = new Scanner(new File("H:\\1º DAW\\Entorno Desarrollo\\CalcImpactWin\\proyecto-ets-daw\\logica\\src\\main\\java\\es\\iespuerto\\ets\\Datos\\Personajes.txt"));
            while (bdPersonajes.hasNextLine()) {
                linea = bdPersonajes.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                Integer stats = Integer.parseInt(palabrasLinea[3]);
                Integer[] talentosPj = { Integer.parseInt(palabrasLinea[4]), Integer.parseInt(palabrasLinea[5]),
                        Integer.parseInt(palabrasLinea[6]) };
                Integer[] ascensionPj = { Integer.parseInt(palabrasLinea[7]), Integer.parseInt(palabrasLinea[8]),
                        Integer.parseInt(palabrasLinea[9]) };
                Personaje datos = new Personaje(id, palabrasLinea[1], palabrasLinea[2], stats, talentosPj,
                        ascensionPj);
                personajes.add(datos);
            }
            bdPersonajes.close();
    }

}
