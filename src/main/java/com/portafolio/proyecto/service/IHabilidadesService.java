
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Habilidades;
import java.util.List;

public interface IHabilidadesService {
    
public List<Habilidades> obtenerHabilidades();
    
public void agregarHabilidades(Habilidades habilidades);

public void actualizarHabilidades(Habilidades habilidades);

public void eliminarHabilidades(Long id);

public Habilidades encontrarHabilidades(Long id); 
 
}
