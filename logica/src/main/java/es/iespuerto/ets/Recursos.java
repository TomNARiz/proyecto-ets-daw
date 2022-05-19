package es.iespuerto.ets;

import java.io.*;
import java.util.*;

/**
 * Esta clase almacena recursos, sus localizaciones y ademas de que enemigos las
 * sueltan
 * 
 * @author Tomas Nahuel Antela Rizzo
 */
public class Recursos {
    private List<Recursos> listaRecursos = new ArrayList<>();
    private Integer codigo;
    private String objeto;
    private String localizacion;
    private String enemigo;

    /**
     * Metodo constructor vacio
     */
    public Recursos(){

    }

    /**
     * Metodo constructor parametrizador para recursos que vienen de enemigos
     * 
     * @param codigo       ID del recurso
     * @param objeto       Recurso en si mismo
     * @param localizacion Localizacion de los enemigos
     * @param enemigo      Enemigo que puede soltar el recurso
     */
    public Recursos(Integer codigo, String objeto, String localizacion, String enemigo) {
        this.codigo = codigo;
        this.objeto = objeto;
        this.localizacion = localizacion;
        this.enemigo = enemigo;
    }

    /**
     * Metodo que devuelve la lista de recursos
     * 
     * @return Lista de recursos
     */
    public List<Recursos> getListaRecursos() {
        return listaRecursos;
    }

    /**
     * Metodo que establece una lista de recursos
     * 
     * @param listaRecursos Lista de recursos
     */
    public void setListaRecursos(List<Recursos> listaRecursos) {
        this.listaRecursos = listaRecursos;
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
     * Metodo constructor parametrizador para recursos que no vienen de enemigos
     * 
     * @param objeto       Recurso en si mismo
     * @param localizacion Localizacion de este recurso
     */
    public Recursos(String objeto, String localizacion) {
        this.objeto = objeto;
        this.localizacion = localizacion;
    }

    /**
     * Metodo que regresa el objeto
     * 
     * @return Regresa el objeto
     */
    public String getObjeto() {
        return objeto;
    }

    /**
     * Metodo que establece el objeto
     * 
     * @param objeto Recurso
     */
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    /**
     * Metodo que regresa la localizacion de los objetos
     * 
     * @return Regresa la localizacion
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * Metodo que establece la localizacion de los objetos
     * 
     * @param localizacion Localizacion de los objetos
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * Metodo que regresa el enemigo que suelta el objeto
     * 
     * @return Regresa el enemigo
     */
    public String getEnemigo() {
        return enemigo;
    }

    /**
     * Metodo oque establece el enemigo que suelta el objeto
     * 
     * @param enemigo Enemigo que suelta el objeto
     */
    public void setEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }

    /**
     * Metodo que lee y aniade la base de datos de Recursos mediante un fichero.
     */
    public void leerDatos() throws FileNotFoundException {
        String linea;
        String[] palabrasLinea;
        try (Scanner bdRecursos = new Scanner(new File(""));) {
            while (bdRecursos.hasNextLine()) {
                linea = bdRecursos.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                Recursos datos = new Recursos(id, palabrasLinea[1], palabrasLinea[2], palabrasLinea[3]);
                listaRecursos.add(datos);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
