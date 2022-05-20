package es.iespuerto.ets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase almacena las arma con su estadisticas y pasivas
 * 
 * @author Tomas Nahuel Antela Rizzo
 * @version 1.0
 * @see Pasiva
 * @see Recursos
 */
public class Armas {
    List<Armas> arma = new ArrayList<>();
    private Integer codigo;
    private String nombre;
    private Integer atqbase;
    private String tipoSubestadistica;
    private Double subestadistica;
    private Integer pasiva;
    private Integer[] recursosAscencion=new Integer[3];

    /**
     * Metodo constructor vacio
     */
    public Armas() {

    }

    /**
     * Metodo constructor parametrizado
     * 
     * @param codigo            ID del arma
     * @param nombre            Nombre del arma
     * @param atqbase           Ataque base del arma
     * @param subestadistica    Subestadistica del arma
     * @param pasiva            Pasiva del arma
     * @param refinamiento      Refinamiento del arma
     * @param recursosAscencion recursosAscenciones del arma
     */
    public Armas(Integer codigo, String nombre, Integer atqbase, String tipoSubestadistica, Double subestadistica,
            Integer pasiva,
            Integer [] recursosAscencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.atqbase = atqbase;
        this.tipoSubestadistica = tipoSubestadistica;
        this.subestadistica = subestadistica;
        this.pasiva = pasiva;
        this.recursosAscencion = recursosAscencion;
    }

    public List<Armas> getList(){
        return this.arma;
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
     * Metodo que regresa el nombre de un arma
     * 
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de un arma
     * 
     * @param nombre Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el ataque base de un arma
     * 
     * @return Regresa el ataque base
     */
    public Integer getAtqbase() {
        return atqbase;
    }

    /**
     * Metodo que establece el ataque base de un arma
     * 
     * @param atqbase Ataque base
     */
    public void setAtqbase(Integer atqbase) {
        this.atqbase = atqbase;
    }

    /**
     * Metodo que regresa el tipo de subestadistica del arma
     * 
     * @return Tipo de subestadistica
     */
    public String getTipoSubestadistica() {
        return tipoSubestadistica;
    }

    /**
     * Metodo que establece el tipo de subestadistica del arma
     * 
     * @param tipoSubestadistica Tipo de Subestadistica
     */
    public void setTipoSubestadistica(String tipoSubestadistica) {
        this.tipoSubestadistica = tipoSubestadistica;
    }

    /**
     * Metodo que regresa la subestadistica del arma
     * 
     * @return Regresa la subestadistica
     */
    public Double getSubestadistica() {
        return subestadistica;
    }

    /**
     * Metodo que establece la subestadistica del arma
     * 
     * @param subestadistica Subestat
     */
    public void setSubestadistica(Double subestadistica) {
        this.subestadistica = subestadistica;
    }

    /**
     * Metodo que regresa la pasiva de un arma
     * 
     * @return Regresa el refinamiento de un arma
     */
    public Integer getPasiva() {
        return pasiva;
    }

    /**
     * Metodo que establece la pasiva de un arma
     * 
     * @param pasiva Pasiva
     */
    public void setPasiva(Integer pasiva) {
        this.pasiva = pasiva;
    }

    /**
     * Metodo que regresa las recursosAscenciones seleccionadas
     * 
     * @return Regresa las recursosAscenciones seleccionadas
     */
    public Integer[] getrecursosAscencion() {
        return recursosAscencion;
    }

    /**
     * Metodo que establece los recursos necesarios para la recursosAscencion/es
     * seleccionadas
     * 
     * @param recursosAscencion recursosAscencion
     */
    public void setrecursosAscencion(Integer[] recursosAscencion) {
        this.recursosAscencion = recursosAscencion;
    }

    /**
     * Metodo que regresa los recursos necesarios para un arma
     * 
     * @param arma Arma
     * @return Recursos necesarios
     */
    public Integer[] perdirRecursos(String arma) {
        for (int i = 0; i < this.arma.size(); i++) {
            if (arma.equals(this.arma.get(i).nombre)) {
                return this.arma.get(i).recursosAscencion;
            }
        }
        return recursosAscencion;
    }

    /**
     * Metodo que lee la base de datos de armas mediante un fichero.
     */
    public void leerDatos() throws FileNotFoundException {
        String linea;
        String[] palabrasLinea;
        String archivo="/media/daw/TOSHIBA EXT/1º DAW/Entorno Desarrollo/CalcImpactWin/proyecto-ets-daw/logica/src/test/java/es/iespuerto/ets/Datos/Armas.txt";
        Scanner bdArmas = new Scanner(new File(archivo));
            while (bdArmas.hasNextLine()) {
                linea = bdArmas.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                Integer atq = Integer.parseInt(palabrasLinea[2]);
                double subestat = Double.parseDouble(palabrasLinea[4]);
                Integer pasivas = Integer.parseInt(palabrasLinea[5]);
                Integer[] recursos ={Integer.parseInt(palabrasLinea[6]),Integer.parseInt(palabrasLinea[7]),Integer.parseInt(palabrasLinea[8])};
                Armas datos = new Armas(id, palabrasLinea[1], atq, palabrasLinea[3], subestat, pasivas, recursos);
                arma.add(datos);
            }
            bdArmas.close();
    }

}
