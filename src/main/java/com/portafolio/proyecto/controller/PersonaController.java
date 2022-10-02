package com.portafolio.proyecto.controller;

import com.portafolio.proyecto.model.Persona;
import com.portafolio.proyecto.service.IPersonaService;
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
@CrossOrigin(origins = "https://frontend-monigab73.firebaseapp.com/")
    public class PersonaController {
@Autowired
    private IPersonaService personaServ;
@GetMapping("/persona/ver")
    public List<Persona> obtener() {
        return personaServ.obtenerPersona();
    }
@ResponseBody
@PostMapping("/persona/nuevo")

    public void agregar(@RequestBody Persona persona) {
        personaServ.agregarPersona(persona);
    }
@PutMapping("/persona/actualizar")
    public void actualizar(@RequestBody Persona persona) {
        personaServ.actualizarPersona(persona);
    }
@DeleteMapping("/persona/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        personaServ.eliminarPersona(id);
    }
}