
package com.portafolio.proyecto.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String descripcion;

    private String fechaRealizacion;

    private String nombre;

    private String urlRepositorio;

    private String imagen;

    private String fechaFinalizacion;

    public Proyectos() {
}
    public Proyectos(Long id, String descripcion, String fechaRealizacion, String nombre, String urlRepositorio, String imagen ,String fechaFinalizacion) {
       this.id = id;
       this.descripcion = descripcion;
       this.fechaRealizacion = fechaRealizacion;
       this.nombre = nombre;
       this.urlRepositorio = urlRepositorio;
       this.imagen = imagen;
       this.fechaFinalizacion = fechaFinalizacion;

 }
}