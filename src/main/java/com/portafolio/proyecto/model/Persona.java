
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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

     @Basic
    private String imagen;

    private String nombreYapellido;

    private String titulo;

    private String ubicacion;

    private String acercaDeMi;
      
    public Persona() {
    }

    public Persona(Long id, String imagen, String nombreYapellido, String titulo, String ubicacion, String acercaDeMi) {
        this.id = id;
        this.imagen = imagen;
        this.nombreYapellido = nombreYapellido;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.acercaDeMi = acercaDeMi;
      }
}
