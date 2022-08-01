
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
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  

    private Long id;

    @Basic

    private String habilidades;

    private Integer porcentajeHabilidades;

    private String imagen;
    public Habilidades() {
    }
        public Habilidades(Long id, String habilidades, Integer porcentajeHabilidades, String imagen) {
        this.id = id;
        this.habilidades = habilidades;
        this.porcentajeHabilidades = porcentajeHabilidades;
        this.imagen = imagen;
    }
  }