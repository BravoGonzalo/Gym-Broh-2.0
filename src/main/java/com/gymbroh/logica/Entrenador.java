package com.gymbroh.logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Gonzalo Bravo
 */
@Entity
public class Entrenador extends Persona{
    public Entrenador() {
    }
    
    public Entrenador(int id, String nombre, String apellido, String tel, String email, String sexo, String contraseña, Date cumpleaños) {
        super(id, nombre, apellido, tel, email, sexo, contraseña, cumpleaños);
    } 
}
