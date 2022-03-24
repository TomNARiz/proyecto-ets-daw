package es.iespuerto.ets;

/**
 * Esta clase almacena los personajes, sus habilidades, elementos y recursos que necesita
 * @author Victor Manuel Cabrera Abreu
 * @see Estadisticas
 * @see Recursos
 */
public class Personaje {
    private String nombre, elemento;
    private Estadisticas estadisticas;
    private String [] talento;
    private Recursos ascension;

    /**
     * 
     * @param nombre Nombre del personaje
     * @param elemento Elemento del personaje
     * @param estadisticas Estadisticas del personaje
     * @param talento Habilidades del personaje
     * @param ascension Recursos que necesita para subir de nivel
     */
    public Personaje(String nombre, String elemento, Estadisticas estadisticas, String[] talento, Recursos ascension) {
        this.nombre = nombre;
        this.elemento = elemento;
        this.estadisticas = estadisticas;
        this.talento = talento;
        this.ascension = ascension;
    }

    /**
     * Metodo que regresa el nombre del personaje
     * @return Regresa el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre del personaje
     * @param nombre Nombre del personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el elemento del personaje
     * @return Regresa el elemento del personaje
     */
    public String getElemento() {
        return elemento;
    }

    /**
     * Metodo que establece el elemento del personaje
     * @param nombre Elemento del personaje
     */
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    /**
     * Metodo que regresa las estadisticas del personaje
     * @return Regresa las estadisticas del personaje
     */
    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    /**
     * Metodo que establece las estadisticas del personaje
     * @param nombre Estadisticas del personaje
     */
    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    /**
     * Metodo que regresa las habilidades del personaje
     * @return Regresa las habilidades del personaje
     */
    public String[] getTalento() {
        return talento;
    }

    /**
     * Metodo que establece las habilidades del personaje
     * @param nombre Habilidades del personaje
     */
    public void setTalento(String[] talento) {
        this.talento = talento;
    }

    /**
     * Metodo que regresa los recursos necesarios del personaje
     * @return Regresa los recursos necesarios del personaje
     */
    public Recursos getAscension() {
        return ascension;
    }

    /**
     * Metodo que establece los recursos necesarios para subirlo de nivel
     * @param nombre Recursos necesarios
     */
    public void setAscension(Recursos ascension) {
        this.ascension = ascension;
    }

}
