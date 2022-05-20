package es.iespuerto.ets;

/**
 * Esta clase almacena la equipacion de cada personaje, con su arma, artefactos y equipo.
 * @author Tomas Nahuel Antela Rizzo
 * @version 1.0
 * @see Personaje
 * @see Armas
 * @see Artefactos
 */
public class Equipacion {
    private Personaje personaje;
    private Armas arma;
    private Artefactos artefactos;

    /**
     * Metodo constructor parametrizado
     * @param personaje Personaje seleccionado
     * @param arma Arma seleccionada
     * @param artefactos Artefactos seleccionados
     */

    public Equipacion(Personaje personaje, Armas arma, Artefactos artefactos) {
        this.personaje = personaje;
        this.arma = arma;
        this.artefactos = artefactos;
    }
    
    /**
     * Metodo que regresa el personaje seleccionado.
     * @return Regresa el personaje
     */
    public Personaje getPersonaje() {
        return personaje;
    }

    /**
     * Metodo que establece el personaje seleccionado
     * @param personaje Personaje seleccionado
     */
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    /**
     * Metodo que regresa el arma seleccionada
     * @return Regresa arma seleccionada
     */
    public Armas getArma() {
        return arma;
    }

    /**
     * Establece el arma seleccionada
     * @param arma Arma seleccionada
     */
    public void setArma(Armas arma) {
        this.arma = arma;
    }

    /**
     * Metodo que regresa los artefactos seleccionados.
     * @return Regresa los artefactos seleccionados
     */
    public Artefactos getArtefactos() {
        return artefactos;
    }

    /**
     * Establece los artefactos seleccionados
     * @param artefactos Artefactos seleccionados
     */
    public void setArtefactos(Artefactos artefactos) {
        this.artefactos = artefactos;
    }
}
