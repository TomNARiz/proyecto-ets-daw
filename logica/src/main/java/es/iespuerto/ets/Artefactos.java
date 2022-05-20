package es.iespuerto.ets;

import java.io.*;
import java.util.*;

/**
 * Esta clase almacena los artefactos e informacion de ellos
 * 
 * @author Victor Manuel Cabrera Abreu
 */
public class Artefactos {
    List<Artefactos> artefacto = new ArrayList<>();
    private String nombre;
    private String localizacion;
    private Integer codigo;
    private String pasiva2;
    private String pasiva4;

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
    public Artefactos(Integer codigo, String nombre, String localizacion, String pasiva2, String pasiva4) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.pasiva2 = pasiva2;
        this.pasiva4 = pasiva4;
    }


    public List<Artefactos> getLista(){
        return this.artefacto;
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
    public String getPasiva2() {
        return pasiva2;
    }

    /**
     * Metodo que establece la pasiva de 2 piezas de los artefactos
     * 
     * @param pasiva2 Pasiva de 2 piezas
     */
    public void setPasiva2(String pasiva2) {
        this.pasiva2 = pasiva2;
    }

    /**
     * Metodo que regresa la pasiva de 4 piezas de los artefactos
     * 
     * @return Regresa la pasiva
     */
    public String getPasiva4() {
        return pasiva4;
    }

    /**
     * Metodo que establece la pasiva de 4 piezas de los artefactos
     * 
     * @param pasiva4 Pasiva de 4 piezas
     */
    public void setPasiva4(String pasiva4) {
        this.pasiva4 = pasiva4;
    }

    /**
     * Metodo que lee y aniade la base de datos de armas mediante un fichero.
     */
    public void leerDatos() throws FileNotFoundException {
        String linea;
        String[] palabrasLinea;
        String archivo="/media/daw/TOSHIBA EXT/1º DAW/Entorno Desarrollo/CalcImpactWin/proyecto-ets-daw/logica/src/test/java/es/iespuerto/ets/Datos/Artefactos.txt";
        Scanner bdArtefactos = new Scanner(new File(archivo));
            while (bdArtefactos.hasNextLine()) {
                linea = bdArtefactos.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                Artefactos datos = new Artefactos(id, palabrasLinea[1], palabrasLinea[2], palabrasLinea[3], palabrasLinea[4]);
                artefacto.add(datos);
            }
            bdArtefactos.close();
        }

}
