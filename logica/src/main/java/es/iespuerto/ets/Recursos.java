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
    List<Recursos> listaRecursos = new ArrayList<>();
    private Integer codigo;
    private String[] objeto;
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
     * @param enemigo      Enemigo que puede soltar el recurso
     */
    public Recursos(Integer codigo, String[] objeto, String enemigo) {
        this.codigo = codigo;
        this.objeto = objeto;
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
     * Metodo que regresa el objeto
     * 
     * @return Regresa el objeto
     */
    public String[] getObjeto() {
        return objeto;
    }

    /**
     * Metodo que establece el objeto
     * 
     * @param objeto Recurso
     */
    public void setObjeto(String[] objeto) {
        this.objeto = objeto;
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
        String archivo="/media/daw/TOSHIBA EXT/1º DAW/Entorno Desarrollo/CalcImpactWin/proyecto-ets-daw/logica/src/test/java/es/iespuerto/ets/Datos/Recursos.txt";
        Scanner bdRecursos = new Scanner(new File(archivo));
            while (bdRecursos.hasNextLine()) {
                linea = bdRecursos.nextLine();
                palabrasLinea = linea.split(";");
                Integer id = Integer.parseInt(palabrasLinea[0]);
                String[] objetos={palabrasLinea[1], palabrasLinea[2], palabrasLinea[3],palabrasLinea[4], palabrasLinea[5]};
                Recursos datos = new Recursos(id, objetos, palabrasLinea[6]);
                listaRecursos.add(datos);
            }
            bdRecursos.close();

    }
}
