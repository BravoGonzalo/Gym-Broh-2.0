package com.gymbroh.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author Gonzalo Bravo
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String apellido;
    private String tel;
    private String email;
    private String sexo;
    private String contraseña;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cumpleaños;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String tel, String email, String sexo, String contraseña, Date cumpleaños) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.email = email;
        this.sexo = sexo;
        this.contraseña = contraseña;
        this.cumpleaños = cumpleaños;
    }
    
    public Persona(int id, String nombre, String apellido, String tel, String email, String sexo, Date cumpleaños) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.email = email;
        this.sexo = sexo;
        this.cumpleaños = cumpleaños;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Date cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
}
