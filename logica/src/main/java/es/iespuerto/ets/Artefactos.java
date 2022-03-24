package es.iespuerto.ets;


/**
 * Esta clase almacena los artefactos e informacion de ellos
 * @author Victor Manuel Cabrera Abreu
 */
public class Artefactos {
    private String nombre, localizacion, pasiva2, pasiva4;
    private Double estatbase;
    private Double [][] subestadistica;

    /**
     * Metodo constructor parametrizador
     * @param nombre Nombre del conjunto de artefactos
     * @param localizacion Localizacion de los artefactos
     * @param pasiva2 Pasiva de 2 piezas de los artefactos
     * @param pasiva4 Pasiva de 4 piezas de los artefactos
     * @param estatbase Estat base de cada artefacto
     * @param subestadistica Subestadisticas de los artefactos
     */
    public Artefactos(String nombre, String localizacion, String pasiva2, String pasiva4, Double estatbase,
            Double [][] subestadistica) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.pasiva2 = pasiva2;
        this.pasiva4 = pasiva4;
        this.estatbase = estatbase;
        this.subestadistica = subestadistica;
    }

    /**
     * Metodo que regresa el nombre de los artefactos
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de los artefactos
     * @param nombre Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa la localizacion de los artefactos
     * @return Regresa la localizacion
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * Metodo que establece la localizacion de los artefacos
     * @param localizacion Localizacion
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * Metodo que regresa la pasiva de 2 piezas de los artefactos
     * @return Regresa la pasiva
     */
    public String getPasiva2() {
        return pasiva2;
    }

    /**
     * Metodo que establece la pasiva de 2 piezas de los artefactos
     * @param pasiva2 Pasiva de 2 piezas
     */
    public void setPasiva2(String pasiva2) {
        this.pasiva2 = pasiva2;
    }

    /**
     * Metodo que regresa la pasiva de 4 piezas de los artefactos
     * @return Regresa la pasiva
     */
    public String getPasiva4() {
        return pasiva4;
    }

    /**
     * Metodo que establece la pasiva de 4 piezas de los artefactos
     * @param pasiva4 Pasiva de 4 piezas
     */
    public void setPasiva4(String pasiva4) {
        this.pasiva4 = pasiva4;
    }

    /**
     * Metodo que regresa la estat base de los artefactos
     * @return Regresa la estat base
     */
    public Double getEstatbase() {
        return estatbase;
    }

    /**
     * Metodo que establece la estat base de los artefactos
     * @param estatbase Estat base
     */
    public void setEstatbase(Double estatbase) {
        this.estatbase = estatbase;
    }

    /**
     * Metodo que regresa las subestadisticas de los artefactos
     * @return Regresa las subestadisticas
     */
    public Double [][] getSubestadistica() {
        return subestadistica;
    }

    /**
     * Metodo que establece las subestadisticas de los artefactos
     * @param subestadistica Subestadisticas
     */
    public void setSubestadistica(Double [][] subestadistica) {
        this.subestadistica = subestadistica;
    }

}
