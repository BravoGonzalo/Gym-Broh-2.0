package com.gymbroh.logica;

import com.gymbroh.logica.Cliente;
import com.gymbroh.logica.Ejercicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-01T16:35:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Rutina.class)
public class Rutina_ { 

    public static volatile SingularAttribute<Rutina, Cliente> cliente;
    public static volatile ListAttribute<Rutina, Ejercicio> rutina;
    public static volatile SingularAttribute<Rutina, Integer> idRutina;
    public static volatile SingularAttribute<Rutina, String> dia;

}