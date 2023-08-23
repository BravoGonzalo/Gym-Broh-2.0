package com.gymbroh.logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Gonzalo Bravo
 */
@Entity
public class Cliente extends Persona {
    @OneToOne
    private Rutina rutina;

    public Cliente() {
    }

    public Cliente(Rutina rutina, int id, String nombre, String apellido, String tel, String email, String sexo, Date cumpleaños) {
        super(id, nombre, apellido, tel, email, sexo, cumpleaños);
        this.rutina = rutina;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }
}
