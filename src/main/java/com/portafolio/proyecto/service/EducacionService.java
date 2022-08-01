
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Educacion;
import com.portafolio.proyecto.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
public class EducacionService implements IEducacionService{
     @Autowired
    private EducacionRepository educacionRepo;

    @Override
    public List<Educacion> obtenerEducacion() {
        return educacionRepo.findAll();
    }
    @Override
    public void agregarEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }

    @Override
    public void actualizarEducacion(Educacion educacion) {
        educacionRepo.save(educacion);
    }


 @Override
    public void eliminarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }


 @Override
    public Educacion encontrarEducacion(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }

}
