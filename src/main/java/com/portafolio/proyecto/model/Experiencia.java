
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

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

     @Basic
    private String empresa;

    private String puesto;

    private String fechaInicio;

    private String fechaFinalizacion;

    private String imagen;
    
    public Experiencia() {
    }
    public Experiencia(Long id, String empresa, String puesto, String fechaInicio, String fechaFinalizacion, String imagen) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.imagen = imagen;
   } 
}
