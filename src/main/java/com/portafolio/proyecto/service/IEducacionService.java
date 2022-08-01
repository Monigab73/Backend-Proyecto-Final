
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Educacion;
import java.util.List;


public interface IEducacionService {
public List<Educacion> obtenerEducacion();

public void agregarEducacion(Educacion educacion);

public void actualizarEducacion(Educacion educacion);

public void eliminarEducacion(Long id);

public Educacion encontrarEducacion(Long id); 

}
