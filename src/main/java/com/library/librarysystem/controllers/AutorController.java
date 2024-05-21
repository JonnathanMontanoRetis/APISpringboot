package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.Autor;
import com.library.librarysystem.services.AutorService;
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
@RequestMapping("api/autor")
public class AutorController {
    
    @Autowired
    private AutorService autorServicio;
    
    @RequestMapping(value = "/getAll")
    public List<Autor> listar() {
        return autorServicio.ObtenerAutores();
    }
    
    @PostMapping
    public Autor crear(@RequestBody Autor autor) {
        return autorServicio.AgregarAutor(autor);
    }
    
    @PutMapping
    public Autor actualizar(@RequestBody Autor autor) {
        return autorServicio.ActualizarAutor(autor);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Autor autor) {
        autorServicio.EliminarAutor(autor);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/autor/123*/
    public Optional<Autor> obtenerPorID(@PathVariable String id) {
        return autorServicio.ObtenerAutorPorId(id);
    }
}
