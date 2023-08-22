package com.gymbroh.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gonzalo Bravo
 */
@Entity
public class Ejercicio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idEj;
    private String NomEjercicio;
    private int series;
    private int repeticiones;

    public Ejercicio() {
    }

    public Ejercicio(int idEj, String NomEjercicio, int series, int repeticiones) {
        this.idEj = idEj;
        this.NomEjercicio = NomEjercicio;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public int getIdEj() {
        return idEj;
    }

    public void setIdEj(int idEj) {
        this.idEj = idEj;
    }

    public String getNomEjercicio() {
        return NomEjercicio;
    }

    public void setNomEjercicio(String NomEjercicio) {
        this.NomEjercicio = NomEjercicio;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }
}
