package com.portafolio.proyecto.controller;

import com.portafolio.proyecto.model.Proyectos;
import com.portafolio.proyecto.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
    public class ProyectosController {
@Autowired
    private IProyectosService proyectosServ;
@GetMapping("/proyectos/ver")
    public List<Proyectos> obtener() {
        return proyectosServ.obtenerProyectos();
    }
@ResponseBody
@PostMapping("/proyectos/nuevo")
     public void agregar(@RequestBody Proyectos proyectos) {
        proyectosServ.agregarProyectos(proyectos);
    }
@PutMapping("/proyectos/actualizar")
    public void actualizar(@RequestBody Proyectos proyectos) {
        proyectosServ.actualizarProyectos(proyectos);
    }
@DeleteMapping("/proyectos/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        proyectosServ.eliminarProyectos(id);
    }
   }