package es.iespuerto.ets;

import java.util.ArrayList;

/**
 * Esta clase almacena las estadisticas base de un personaje
 * @author Victor Manuel Cabrera Abreu 
 */
public class Estadisticas {
    private Integer vidabase, atqbase, defbase, maestria;
    private Double recarga, probCrit, dnCrit;
    private ArrayList<String> bonoelemnt=new ArrayList<>();
    private ArrayList<String> reselemnt=new ArrayList<>();

    /**
     * Metodo constructor
     * @param vidabase Vida base del personaje
     * @param atqbase Ataque base del personaje
     * @param defbase Defensa base del personaje
     * @param maestria Maestria elemental del personaje
     * @param recarga Recarga de energia del personaje
     * @param probCrit Probabilidad de Critico del personaje
     * @param dnCrit Danio de los Criticos del personaje
     * @param bonoelemnt Bono Danio de uno o varios elementos
     * @param reselemnt Resistencia a uno o varios elementos
     */
    public Estadisticas(Integer vidabase, Integer atqbase, Integer defbase, Integer maestria, Double recarga,
            Double probCrit, Double dnCrit, ArrayList<String> bonoelemnt, ArrayList<String> reselemnt) {
        this.vidabase = vidabase;
        this.atqbase = atqbase;
        this.defbase = defbase;
        this.maestria = maestria;
        this.recarga = recarga;
        this.probCrit = probCrit;
        this.dnCrit = dnCrit;
        this.bonoelemnt = bonoelemnt;
        this.reselemnt = reselemnt;
    }

    /**
     * Metodo que regresa la vida base del personaje
     * @return Regresa vida base
     */
    public Integer getVidabase() {
        return vidabase;
    }

    /**
     * Metodo que establece la vida base de un personaje
     * @param vidabase Vida base
     */
    public void setVidabase(Integer vidabase) {
        this.vidabase = vidabase;
    }

    /**
     * Metodo que regresa el ataque base de un personaje
     * @return Regresa el ataque base
     */
    public Integer getAtqbase() {
        return atqbase;
    }

    /**
     * Metodo que establece el ataque base de un personaje
     * @param atqbase Ataque base
     */
    public void setAtqbase(Integer atqbase) {
        this.atqbase = atqbase;
    }

    /**
     * Metodo que regresa la defensa base de un personaje
     * @return Regresa la defensa base
     */
    public Integer getDefbase() {
        return defbase;
    }

    /**
     * Metodo que establece la defensa base de un personaje
     * @param defbase Defensa base
     */
    public void setDefbase(Integer defbase) {
        this.defbase = defbase;
    }

    /**
     * Metodo que regresa la maestria elemental de un personaje
     * @return Regresa la maestria elemental
     */
    public Integer getMaestria() {
        return maestria;
    }

    /**
     * Metodo que establece la maestria elemental de un personaje
     * @param maestria Maestria elemental
     */
    public void setMaestria(Integer maestria) {
        this.maestria = maestria;
    }

    /**
     * Metodo que regresa la recarga de energia de un personaje
     * @return Regresa la recarga de energia
     */
    public Double getRecarga() {
        return recarga;
    }

    /**
     * Metodo que establece la recarga de energia de un personaje
     * @param recarga Recarga de energia
     */
    public void setRecarga(Double recarga) {
        this.recarga = recarga;
    }

    /**
     * Metodo que regresa la probabilidad de critico de un personaje
     * @return Regresa la probabilidad de critico
     */
    public Double getProbCrit() {
        return probCrit;
    }

    /**
     * Metodo que establece la probabilidad de critico de un personaje
     * @param probCrit Probabilidad de critico
     */
    public void setProbCrit(Double probCrit) {
        this.probCrit = probCrit;
    }

    /**
     * Metodo que regresa el danio de critico de un personaje
     * @return Regresa danio de critico
     */
    public Double getDnCrit() {
        return dnCrit;
    }

    /**
     * Metodo que establece el danio de critico de un personaje
     * @param dnCrit Danio de critico
     */
    public void setDnCrit(Double dnCrit) {
        this.dnCrit = dnCrit;
    }

    /**
     * Metodo que regresa los bonos de danio elemental que tiene un personaje
     * @return Regresa los bonos danios elementales
     */
    public ArrayList<String> getBonoelemnt() {
        return bonoelemnt;
    }

    /**
     * Metodo que establece los bonos de danio elemental de un personaje
     * @param bonoelemnt Bonos de danio elemental
     */
    public void setBonoelemnt(ArrayList<String> bonoelemnt) {
        this.bonoelemnt = bonoelemnt;
    }

    /**
     * Metodo que regresa las resistencias elementales de un personaje
     * @return Regresa resistencias elementales
     */
    public ArrayList<String> getReselemnt() {
        return reselemnt;
    }

    /**
     * Metodo que establece las resistencias elementales de un personaje
     * @param reselemnt Resistencias elementales
     */
    public void setReselemnt(ArrayList<String> reselemnt) {
        this.reselemnt = reselemnt;
    } 
}
