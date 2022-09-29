
package com.portafolio.proyecto.controller;

import com.portafolio.proyecto.model.Habilidades;
import com.portafolio.proyecto.service.IHabilidadesService;
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
@CrossOrigin(origins = "https://frontend-monigab73.web.app")
public class HabilidadesController {
   
    @Autowired
    private IHabilidadesService habilidadesServ;
    
    @GetMapping("/habilidades/lista")
    @ResponseBody
    
    public List<Habilidades> obtener() {
        return habilidadesServ.obtenerHabilidades();
    }
    @PostMapping("/habilidades/nuevo")
    public void agregar(@RequestBody Habilidades habilidades) {
        habilidadesServ.agregarHabilidades(habilidades);
    }
    
    
    @PutMapping("/habilidades/actualizar")
    public void actualizar(@RequestBody Habilidades habilidades) {
        habilidadesServ.actualizarHabilidades(habilidades);
    }

    @DeleteMapping("/habilidades/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        habilidadesServ.eliminarHabilidades(id);
    }
  }
