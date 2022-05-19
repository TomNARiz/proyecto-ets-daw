package es.iespuerto.ets;

import java.io.*;
import java.util.*;

/**
 * Esta clase almacena los artefactos e informacion de ellos
 * 
 * @author Victor Manuel Cabrera Abreu
 */
public class Artefactos {
    private List<Artefactos> artefacto = new ArrayList<>();
    private String nombre;
    private String localizacion;
    private Integer codigo;
    private Integer pasiva2;
    private Integer pasiva4;
    private Double estatbase;

    /**
     * Metodo constructor vacio
     */
    public Artefactos(){

    }

    /**
     * Metodo constructor parametrizador
     * 
     * @param codigo         ID del conjunto de artefactos
     * @param nombre         Nombre del conjunto de artefactos
     * @param localizacion   Localizacion de los artefactos
     * @param pasiva2        Pasiva de 2 piezas de los artefactos
     * @param pasiva4        Pasiva de 4 piezas de los artefactos
     * @param estatbase      Estat base de cada artefacto
     * @param subestadistica Subestadisticas de los artefactos
     */
    public Artefactos(Integer codigo, String nombre, String localizacion, Integer pasiva2, Integer pasiva4,
            Double estatbase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.pasiva2 = pasiva2;
        this.pasiva4 = pasiva4;
        this.estatbase = estatbase;
    }

    /**
     * Metodo que regresa el ID de los artefactos
     * 
     * @return Regresa el ID
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Metodo que establece el ID de los artefactos
     * 
     * @param codigo ID
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo que regresa el nombre de los artefactos
     * 
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de los artefactos
     * 
     * @param nombre Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa la localizacion de los artefactos
     * 
     * @return Regresa la localizacion
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * Metodo que establece la localizacion de los artefacos
     * 
     * @param localizacion Localizacion
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * Metodo que regresa la pasiva de 2 piezas de los artefactos
     * 
     * @return Regresa la pasiva
     */
    public Integer getPasiva2() {
        return pasiva2;
    }

    /**
     * Metodo que establece la pasiva de 2 piezas de los artefactos
     * 
     * @param pasiva2 Pasiva de 2 piezas
     */
    public void setPasiva2(Integer pasiva2) {
        this.pasiva2 = pasiva2;
    }

    /**
     * Metodo que regresa la pasiva de 4 piezas de los artefactos
     * 
     * @return Regresa la pasiva
     */
    public Integer getPasiva4() {
        return pasiva4;
    }

    /**
     * Metodo que establece la pasiva de 4 piezas de los artefactos
     * 
     * @param pasiva4 Pasiva de 4 piezas
     */
    public void setPasiva4(Integer pasiva4) {
        this.pasiva4 = pasiva4;
    }

    /**
     * Metodo que regresa la estat base de los artefactos
     * 
     * @return Regresa la estat base
     */
    public Double getEstatbase() {
        return estatbase;
    }

    /**
     * Metodo que establece la estat base de los artefactos
     * 
     * @param estatbase Estat base
     */
    public void setEstatbase(Double estatbase) {
        this.estatbase = estatbase;
    }

    /**
     * Metodo que lee y aniade la base de datos de armas mediante un fichero.
     */
    public void leerDatos() throws FileNotFoundException {
        String linea;
        String[] palabrasLinea;
        try (Scanner bdArtefactos = new Scanner(new File(""));) {
            while (bdArtefactos.hasNextLine()) {
                linea = bdArtefactos.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                Integer pasivaDe2 = Integer.parseInt(palabrasLinea[3]);
                Integer pasivaDe4 = Integer.parseInt(palabrasLinea[4]);
                double statbase = Double.parseDouble(palabrasLinea[5]);
                Artefactos datos = new Artefactos(id, palabrasLinea[1], palabrasLinea[2], pasivaDe2, pasivaDe4,
                        statbase);
                artefacto.add(datos);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
