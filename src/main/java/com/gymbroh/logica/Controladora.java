package com.gymbroh.logica;

import com.gymbroh.igu.Login;
import com.gymbroh.persistencia.ClienteJpaController;
import com.gymbroh.persistencia.EjercicioJpaController;
import com.gymbroh.persistencia.EntrenadorJpaController;
import com.gymbroh.persistencia.RutinaJpaController;
import java.awt.HeadlessException;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo Bravo
 */
public class Controladora {

    ClienteJpaController clienteJpa = new ClienteJpaController();
    EjercicioJpaController ejercicioJpa = new EjercicioJpaController();
    EntrenadorJpaController entrenadorJpa = new EntrenadorJpaController();
    RutinaJpaController rutinaJpa = new RutinaJpaController();

    public void guardarEntrenador(String nombre, String apellido, Date fecha, String sexo, String tel, String contra, String email) {
        Entrenador entrenador = new Entrenador(0, nombre, apellido, tel, email, sexo, contra, fecha);
        try {
            entrenadorJpa.create(entrenador);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }

    public void verificarEntrenador(String email, String contra) {
        EntityManager em = entrenadorJpa.getEntityManager();
        try {
            String jpql = "SELECT e FROM Entrenador e WHERE e.email = :email AND e.contraseña = :contraseña";
            TypedQuery<Entrenador> query = em.createQuery(jpql, Entrenador.class);
            query.setParameter("email", email);
            query.setParameter("contraseña", contra);

            List<Entrenador> resultados = query.getResultList();

            if (resultados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta.");
            } else {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                Login menu = new Login();
                menu.mostrarVentana(resultados.get(0));
            }
        } finally {
            em.close();
        }
    }

    public void guardarCliente(String nombre, String apellido, Date fecha, String sexo, String tel, String email) {
        Cliente cliente = new Cliente(null, 0, nombre, apellido, tel, email, sexo, fecha);
        try{
            clienteJpa.create(cliente);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}
