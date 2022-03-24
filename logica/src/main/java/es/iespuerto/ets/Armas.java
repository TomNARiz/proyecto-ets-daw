package es.iespuerto.ets;

/**
 * Esta clase almacena las armas con su estadisticas y pasivas
 * @author Tomás Nahuel Antela Rizzo
 * @version 1.0
 * @see Pasiva
 * @see Recursos
 */
public class Armas {
    private String nombre;
    private Integer atqbase;
    private Double subestadistica;
    private Pasiva pasiva;
    private Byte refinamiento;
    private Recursos ascension;
    
    /**
     * Metodo constructor parametrizado
     * @param nombre Nombre del arma
     * @param atqbase Ataque base del arma
     * @param subestadistica Subestadistica del arma
     * @param pasiva Pasiva del arma
     * @param refinamiento Refinamiento del arma
     * @param ascension Ascensiones del arma
     */
    public Armas(String nombre, Integer atqbase, Double subestadistica, Pasiva pasiva, Byte refinamiento,
            Recursos ascension) {
        this.nombre = nombre;
        this.atqbase = atqbase;
        this.subestadistica = subestadistica;
        this.pasiva = pasiva;
        this.refinamiento = refinamiento;
        this.ascension = ascension;
    }

    /**
     * Metodo que regresa el nombre de un arma
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de un arma
     * @param nombre Nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el ataque base de un arma
     * @return Regresa el ataque base
     */
    public Integer getAtqbase() {
        return atqbase;
    }

    /**
     * Metodo que establece el ataque base de un arma
     * @param atqbase Ataque base
     */
    public void setAtqbase(Integer atqbase) {
        this.atqbase = atqbase;
    }

    /**
     * Metodo que regresa la subestadistica del arma
     * @return Regresa la subestat
     */
    public Double getSubestadistica() {
        return subestadistica;
    }

    /**
     * Metodo que establece la subestadistica del arma
     * @param subestadistica Subestat
     */
    public void setSubestadistica(Double subestadistica) {
        this.subestadistica = subestadistica;
    }

    /**
     * Metodo que regresa la pasiva de un arma
     * @return Regresa el refinamiento de un arma
     */
    public Pasiva getPasiva() {
        return pasiva;
    }

    /**
     * Metodo que establece la pasiva de un arma
     * @param pasiva Pasiva
     */
    public void setPasiva(Pasiva pasiva) {
        this.pasiva = pasiva;
    }

    /**
     * Metodo que regresa el refinamiento de un arma
     * @return Regresa el refinamiento de un arma
     */
    public Byte getRefinamiento() {
        return refinamiento;
    }

    /**
     * Metodo que establece el refinamiento de un arma
     * @param refinamiento Refinamiento
     */
    public void setRefinamiento(Byte refinamiento) {
        this.refinamiento = refinamiento;
    }

    /**
     * Metodo que regresa las ascensiones seleccionadas
     * @return Regresa las ascensiones seleccionadas
     */
    public Recursos getAscension() {
        return ascension;
    }

    /**
     * Metodo que establece los recursos necesarios para la ascension/es seleccionadas
     * @param ascension Ascension
     */
    public void setAscension(Recursos ascension) {
        this.ascension = ascension;
    }
    
}
