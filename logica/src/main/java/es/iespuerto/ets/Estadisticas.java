package es.iespuerto.ets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase almacena las estadisticas base de un personaje
 * 
 * @author Victor Manuel Cabrera Abreu
 */
public class Estadisticas {
    private List<Estadisticas> stats=new ArrayList<>();
    private Integer codigo;
    private Integer vidabase;
    private Integer atqbase;
    private Integer defbase;
    private Integer maestria;
    private Integer codigoPersonaje;
    private Double recarga;
    private Double probCrit;
    private Double dnCrit;
    private double bonoelemnt;

    /**
     * Metodo constructor vacio
     */
    public Estadisticas(){

    }

    /**
     * Metodo constructor
     * 
     * @param vidabase   Vida base del personaje
     * @param atqbase    Ataque base del personaje
     * @param defbase    Defensa base del personaje
     * @param maestria   Maestria elemental del personaje
     * @param recarga    Recarga de energia del personaje
     * @param probCrit   Probabilidad de Critico del personaje
     * @param dnCrit     Danio de los Criticos del personaje
     * @param bonoelemnt Bono Danio de uno o varios elementos
     * @param reselemnt  Resistencia a uno o varios elementos
     */
    public Estadisticas(Integer codigo, Integer vidabase, Integer atqbase, Integer defbase, Integer maestria,
            Double recarga,
            Double probCrit, Double dnCrit, Double bonoelemnt, Integer codigoPersonaje) {
        this.codigo = codigo;
        this.vidabase = vidabase;
        this.atqbase = atqbase;
        this.defbase = defbase;
        this.maestria = maestria;
        this.recarga = recarga;
        this.probCrit = probCrit;
        this.dnCrit = dnCrit;
        this.bonoelemnt = bonoelemnt;
        this.codigoPersonaje = codigoPersonaje;
    }

    public Estadisticas getEstadisticas(Integer idPersonaje){
        Estadisticas aux=null;
        for (int i = 0; i < stats.size(); i++) {
            if (idPersonaje.equals(stats.get(i).codigoPersonaje)) {
                aux=stats.get(i);
            }
        }
        return aux;
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
     * Metodo que devuelve el codigo de personaje
     * 
     * @return Codigo de personaje
     */
    public Integer getCodigoPersonaje() {
        return codigoPersonaje;
    }

    /**
     * Metodo que establece un codigo de personaje
     * 
     * @param codigoPersonaje Codigo de personaje
     */
    public void setCodigoPersonaje(Integer codigoPersonaje) {
        this.codigoPersonaje = codigoPersonaje;
    }

    /**
     * Metodo que regresa la vida base del personaje
     * 
     * @return Regresa vida base
     */
    public Integer getVidabase() {
        return vidabase;
    }

    /**
     * Metodo que establece la vida base de un personaje
     * 
     * @param vidabase Vida base
     */
    public void setVidabase(Integer vidabase) {
        this.vidabase = vidabase;
    }

    /**
     * Metodo que regresa el ataque base de un personaje
     * 
     * @return Regresa el ataque base
     */
    public Integer getAtqbase() {
        return atqbase;
    }

    /**
     * Metodo que establece el ataque base de un personaje
     * 
     * @param atqbase Ataque base
     */
    public void setAtqbase(Integer atqbase) {
        this.atqbase = atqbase;
    }

    /**
     * Metodo que regresa la defensa base de un personaje
     * 
     * @return Regresa la defensa base
     */
    public Integer getDefbase() {
        return defbase;
    }

    /**
     * Metodo que establece la defensa base de un personaje
     * 
     * @param defbase Defensa base
     */
    public void setDefbase(Integer defbase) {
        this.defbase = defbase;
    }

    /**
     * Metodo que regresa la maestria elemental de un personaje
     * 
     * @return Regresa la maestria elemental
     */
    public Integer getMaestria() {
        return maestria;
    }

    /**
     * Metodo que establece la maestria elemental de un personaje
     * 
     * @param maestria Maestria elemental
     */
    public void setMaestria(Integer maestria) {
        this.maestria = maestria;
    }

    /**
     * Metodo que regresa la recarga de energia de un personaje
     * 
     * @return Regresa la recarga de energia
     */
    public Double getRecarga() {
        return recarga;
    }

    /**
     * Metodo que establece la recarga de energia de un personaje
     * 
     * @param recarga Recarga de energia
     */
    public void setRecarga(Double recarga) {
        this.recarga = recarga;
    }

    /**
     * Metodo que regresa la probabilidad de critico de un personaje
     * 
     * @return Regresa la probabilidad de critico
     */
    public Double getProbCrit() {
        return probCrit;
    }

    /**
     * Metodo que establece la probabilidad de critico de un personaje
     * 
     * @param probCrit Probabilidad de critico
     */
    public void setProbCrit(Double probCrit) {
        this.probCrit = probCrit;
    }

    /**
     * Metodo que regresa el danio de critico de un personaje
     * 
     * @return Regresa danio de critico
     */
    public Double getDnCrit() {
        return dnCrit;
    }

    /**
     * Metodo que establece el danio de critico de un personaje
     * 
     * @param dnCrit Danio de critico
     */
    public void setDnCrit(Double dnCrit) {
        this.dnCrit = dnCrit;
    }

    /**
     * Metodo que regresa los bonos de danio elemental que tiene un personaje
     * 
     * @return Regresa los bonos danios elementales
     */
    public Double getBonoelemnt() {
        return bonoelemnt;
    }

    /**
     * Metodo que establece los bonos de danio elemental de un personaje
     * 
     * @param bonoelemnt Bonos de danio elemental
     */
    public void setBonoelemnt(Double bonoelemnt) {
        this.bonoelemnt = bonoelemnt;
    }

        /**
     * Metodo que lee y aniade la base de datos de las estadisticas mediante un fichero.
     */
    public void leerDatos() throws FileNotFoundException {
        String linea;
        String[] palabrasLinea;
        Scanner bdEstadisticas = new Scanner(new File(
                "H:\\1º DAW\\Entorno Desarrollo\\CalcImpactWin\\proyecto-ets-daw\\logica\\src\\main\\java\\es\\iespuerto\\ets\\Datos\\Estadisticas.txt"));
        bdEstadisticas.nextLine();
        while (bdEstadisticas.hasNextLine()) {
            linea = bdEstadisticas.nextLine();
            palabrasLinea = linea.split(";");
            Integer id = Integer.parseInt(palabrasLinea[0]);
            Integer vida = Integer.parseInt(palabrasLinea[1]);
            Integer ataque = Integer.parseInt(palabrasLinea[2]);
            Integer defensa = Integer.parseInt(palabrasLinea[3]);
            Integer maestriaElemental = Integer.parseInt(palabrasLinea[4]);

            Double recargaEnergia = Double.parseDouble(palabrasLinea[5]);
            Double probabilidadCrit = Double.parseDouble(palabrasLinea[6]);
            Double danioCrit = Double.parseDouble(palabrasLinea[7]);
            Double bonoElemental = Double.parseDouble(palabrasLinea[8]);
            Integer idPersonaje = Integer.parseInt(palabrasLinea[9]);
            Estadisticas datos = new Estadisticas(id, vida, ataque, defensa, maestriaElemental, recargaEnergia,
                    probabilidadCrit, danioCrit, bonoElemental, idPersonaje);
            stats.add(datos);
        }
        bdEstadisticas.close();
    }
}
