
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Proyectos;
import java.util.List;


public interface IProyectosService {
public List<Proyectos> obtenerProyectos(); 
  
public void agregarProyectos(Proyectos proyectos);

public void actualizarProyectos(Proyectos proyectos);

public void eliminarProyectos(Long id);

public Proyectos encontrarProyectos(Long id);
  
}
