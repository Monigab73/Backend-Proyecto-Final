
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

public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String institucion;

    private String titulo;

    private String fechaInicio;

    private String fechaFinalizacion;

    private String imagen;

    public Educacion() {
    }
    public Educacion(Long id, String institucion, String titulo, String fechaInicio, String fechaFinalizacion, String imagen) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.imagen = imagen;
    }
} 
