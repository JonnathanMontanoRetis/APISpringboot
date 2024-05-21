package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.AutorLibro;
import com.library.librarysystem.services.AutorLibroService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/autorlibro")
public class AutorLibroController {
    
    @Autowired
    private AutorLibroService autorLibroServicio;
    
    @RequestMapping(value = "/getAll")
    public List<AutorLibro> listar() {
        return autorLibroServicio.ObtenerAutorLibro();
    }
    
    @PostMapping
    public AutorLibro crear(@RequestBody AutorLibro autorLibro) {
        return autorLibroServicio.AgregarAutorLibro(autorLibro);
    }
    
    @PutMapping
    public AutorLibro actualizar(@RequestBody AutorLibro autorLibro) {
        return autorLibroServicio.ActualizarAutorLibro(autorLibro);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody AutorLibro autorLibro) {
        autorLibroServicio.EliminarAutorLibro(autorLibro);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/autorLibro/123*/
    public Optional<AutorLibro> obtenerPorID(@PathVariable String id) {
        return autorLibroServicio.ObtenerAutorLibroPorId(id);
    }
}
