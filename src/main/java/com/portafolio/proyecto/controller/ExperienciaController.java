package com.portafolio.proyecto.controller;

import com.portafolio.proyecto.model.Experiencia;
import com.portafolio.proyecto.service.IExperienciaService;
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

public class ExperienciaController {

    @Autowired
    private IExperienciaService experienciaServ;

    @GetMapping("/experiencia/lista")
    @ResponseBody
   
    public List<Experiencia> obtener() {
        return experienciaServ.obtenerExperiencia();
    }
    @PostMapping("/experiencia/nuevo")
    public void agregar(@RequestBody Experiencia experiencia) {
        experienciaServ.agregarExperiencia(experiencia);
    }

    @PutMapping("/experiencia/actualizar")
    public void actualizar(@RequestBody Experiencia experiencia) {
        experienciaServ.actualizarExperiencia(experiencia);
    }

    @DeleteMapping("/experiencia/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        experienciaServ.eliminarExperiencia(id);
    }
}
