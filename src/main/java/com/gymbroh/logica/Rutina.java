package com.gymbroh.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Gonzalo Bravo
 */
@Entity
public class Rutina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idRutina;
    private String dia;
    @OneToOne
    private List<Ejercicio> rutina;

    public Rutina() {
    }

    public Rutina(int idRutina, String dia, List<Ejercicio> rutina) {
        this.idRutina = idRutina;
        this.dia = dia;
        this.rutina = rutina;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<Ejercicio> getRutina() {
        return rutina;
    }

    public void setRutina(List<Ejercicio> rutina) {
        this.rutina = rutina;
    }

}
