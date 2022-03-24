package es.iespuerto.ets;

/**
 * Esta clase almacena recursos, sus localizaciones y ademas de que enemigos las sueltan
 * @author Tomás Nahuel Antela Rizzo
 */
public class Recursos {
    private String objeto, localizacion, enemigo;

    /**
     * Metodo constructor parametrizador para recursos que vienen de enemigos
     * @param objeto Recurso en si mismo
     * @param localizacion Localizacion de los enemigos
     * @param enemigo Enemigo que puede soltar el recurso
     */
    public Recursos(String objeto, String localizacion, String enemigo) {
        this.objeto = objeto;
        this.localizacion = localizacion;
        this.enemigo = enemigo;
    }

    /**
    * Metodo constructor parametrizador para recursos que no vienen de enemigos
     * @param objeto Recurso en si mismo
     * @param localizacion Localizacion de este recurso
     */
    public Recursos(String objeto, String localizacion) {
        this.objeto = objeto;
        this.localizacion = localizacion;
    }

    /**
     * Metodo que regresa el objeto
     * @return Regresa el objeto
     */
    public String getObjeto() {
        return objeto;
    }

    /**
     * Metodo que establece el objeto
     * @param objeto Recurso
     */
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    /**
     * Metodo que regresa la localizacion de los objetos
     * @return Regresa la localizacion
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * Metodo que establece la localizacion de los objetos
     * @param localizacion Localizacion de los objetos
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * Metodo que regresa el enemigo que suelta el objeto
     * @return Regresa el enemigo
     */
    public String getEnemigo() {
        return enemigo;
    }

    /**
     * Metodo oque establece el enemigo que suelta el objeto
     * @param enemigo Enemigo que suelta el objeto
     */
    public void setEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }
}
