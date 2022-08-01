
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Persona;
import com.portafolio.proyecto.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
public class PersonaService implements IPersonaService{
         
    @Autowired
    private PersonaRepository personaRepo;
    
    @Override
    public List<Persona> obtenerPersona() {
        return personaRepo.findAll();
    }
    @Override
    public void agregarPersona(Persona persona) {
        personaRepo.save(persona);
    }
    @Override
    public void actualizarPersona(Persona persona) {
        personaRepo.save(persona);
    }
    @Override
    public void eliminarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Long id) {
        return personaRepo.findById(id).orElse(null);
    }
  }