
package com.portafolio.proyecto.service;

import com.portafolio.proyecto.model.Proyectos;
import com.portafolio.proyecto.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class ProyectosService implements IProyectosService{
    @Autowired
    private ProyectosRepository proyectosRepo;
    
    @Override
    public List<Proyectos> obtenerProyectos() {
        return proyectosRepo.findAll();
    }
    @Override
    public void agregarProyectos(Proyectos proyectos) {
        proyectosRepo.save(proyectos);
    }
    @Override
    public void actualizarProyectos(Proyectos proyectos) {
        proyectosRepo.save(proyectos);
    }
    @Override
    public void eliminarProyectos(Long id) {
        proyectosRepo.deleteById(id);
       } 
    @Override
    public Proyectos encontrarProyectos(Long id) {
        return proyectosRepo.findById(id).orElse(null);
    } 
  }
