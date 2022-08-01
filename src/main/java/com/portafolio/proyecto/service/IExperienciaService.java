
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
public List<Experiencia> obtenerExperiencia();

public void agregarExperiencia(Experiencia experiencia);

public void actualizarExperiencia(Experiencia experiencia);

public void eliminarExperiencia(Long id);

public Experiencia encontrarExperiencia(Long id); 

  }
