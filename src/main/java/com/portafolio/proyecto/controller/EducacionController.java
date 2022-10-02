package com.portafolio.proyecto.controller;

import com.portafolio.proyecto.model.Educacion;
import com.portafolio.proyecto.service.IEducacionService;
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
public class EducacionController {

    @Autowired
    private IEducacionService educacionServ;
    @GetMapping("/educacion/lista")
    @ResponseBody
    public List<Educacion> obtener() {
        return educacionServ.obtenerEducacion();
    }

    @PostMapping("/educacion/nuevo")
    public void agregar(@RequestBody Educacion educacion) {
        educacionServ.agregarEducacion(educacion);
    }

    @PutMapping("/educacion/actualizar")
    public void actualizar(@RequestBody Educacion educacion) {
        educacionServ.actualizarEducacion(educacion);
    }

    @DeleteMapping("/educacion/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        educacionServ.eliminarEducacion(id);
    }
}
