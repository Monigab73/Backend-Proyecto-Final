
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Habilidades;
import com.portafolio.proyecto.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    @Autowired
    private HabilidadesRepository habilidadesRepo;

    @Override
    public List<Habilidades> obtenerHabilidades() {
        return habilidadesRepo.findAll();
    }
    @Override
    public void agregarHabilidades(Habilidades habilidades) {
        habilidadesRepo.save(habilidades);
    }

    @Override
    public void actualizarHabilidades(Habilidades habilidades) {
        habilidadesRepo.save(habilidades);
    }


 @Override
    public void eliminarHabilidades(Long id) {
        habilidadesRepo.deleteById(id);
    }


 @Override
    public Habilidades encontrarHabilidades(Long id) {
        return habilidadesRepo.findById(id).orElse(null);
    }
}
