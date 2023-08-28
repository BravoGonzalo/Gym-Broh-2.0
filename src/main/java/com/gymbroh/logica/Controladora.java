package com.gymbroh.logica;

import com.gymbroh.igu.Login;
import com.gymbroh.persistencia.ClienteJpaController;
import com.gymbroh.persistencia.EjercicioJpaController;
import com.gymbroh.persistencia.EntrenadorJpaController;
import com.gymbroh.persistencia.RutinaJpaController;
import com.gymbroh.persistencia.exceptions.NonexistentEntityException;
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

    public void verificarEntrenador(String email, String contra, Login VentanaLogin) {
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
                VentanaLogin.disposeVentana();
                Login menu = new Login();
                menu.mostrarVentana(resultados.get(0));
            }
        } finally {
            em.close();
        }
    }

    public void guardarCliente(String nombre, String apellido, Date fecha, String sexo, String tel, String email) {
        Cliente cliente = new Cliente(null, 0, nombre, apellido, tel, email, sexo, fecha);
        try {
            clienteJpa.create(cliente);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities();
    }

    public void modificarCliente(Cliente cliente, String nombre, String apellido, Date fecha, String sexo, String tel, String email) {
        try {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCumpleaños(fecha);
            cliente.setSexo(sexo);
            cliente.setTel(tel);
            cliente.setEmail(email);
            clienteJpa.edit(cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente no editado");
        }
    }

    public Cliente traerCliente(int id) {
        return clienteJpa.findCliente(id);
    }

    public void eliminarCliente(int id) {
        try {
            clienteJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente.");
        }
    }

    public Ejercicio guardarEjercicio(String ejercicio, int reps, int series) {
        Ejercicio ej = new Ejercicio(0, ejercicio, series, reps);
        try {
            ejercicioJpa.create(ej);
            return ej;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el ejercicio.");
            return null;
        }
    }

    public void guardarRutina(Cliente cliente, List<Ejercicio> rutina, String dia) {
        Rutina rutinas = new Rutina(0, dia, rutina, cliente);
        try {
            rutinaJpa.create(rutinas);
            JOptionPane.showMessageDialog(null, "Rutina creada con exito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear la turina.");
        }
    }

    public List<Rutina> traerRutina() {
        try {
            return rutinaJpa.findRutinaEntities();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al traer la rutina.");
            return null;
        }
    }

    public List<Rutina> traerRutinaPorNombre(String nombre) {
        EntityManager em = rutinaJpa.getEntityManager();
        try {
            String jpql = "SELECT r FROM Rutina r WHERE r.cliente.nombre = :nombre";
            TypedQuery<Rutina> query = em.createQuery(jpql, Rutina.class);
            query.setParameter("nombre", nombre);

            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
