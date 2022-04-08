package es.iespuerto.ets;

/**
 * Esta clase almacena las pasivas de distintas armas
 * @author Tomas Nahuel Antela Rizzo
 */
public class Pasiva {
    private String nombre, descripcion, bono;

    /**
     * Metodo constructor parametrizador
     * @param nombre Nombre de la pasiva
     * @param descripcion Descripcion de la pasiva
     * @param bono Bono de la pasiva
     */
    public Pasiva(String nombre, String descripcion, String bono) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bono = bono;
    }

    /**
     * Metodo que regresa el nombre de la pasiva
     * @return Regresa el nombre de la pasiva
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de la pasiva
     * @param nombre Nombre de la pasiva
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa la descripcion de la pasiva
     * @return Regresa la descripcion de la pasiva
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo que establece la descripcion de la pasiva
     * @param descripcion Descripcion de la pasiva
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo que regresa el bono de la pasiva
     * @return Regresa el bono de la pasiva
     */
    public String getBono() {
        return bono;
    }

    /**
     * Metodo que establece el bono de la pasiva
     * @param bono Bono de la pasiva
     */
    public void setBono(String bono) {
        this.bono = bono;
    }
}
