
package com.portafolio.proyecto.service;


import com.portafolio.proyecto.model.Persona;
import java.util.List;

public interface IPersonaService {
public List<Persona> obtenerPersona();

public void agregarPersona(Persona persona);

public void actualizarPersona(Persona persona);

public void eliminarPersona(Long id);

public Persona encontrarPersona(Long id);    
}
