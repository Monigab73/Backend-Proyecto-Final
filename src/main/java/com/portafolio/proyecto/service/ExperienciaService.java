
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Experiencia;
import com.portafolio.proyecto.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

     @Service
public class ExperienciaService implements IExperienciaService{
     @Autowired
    private ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> obtenerExperiencia() {
        return experienciaRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void actualizarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }


 @Override
    public void eliminarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }


 @Override
    public Experiencia encontrarExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }
}
  