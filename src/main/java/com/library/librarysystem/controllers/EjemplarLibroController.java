package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.EjemplarLibro;
import com.library.librarysystem.services.EjemplarLibroService;
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
@RequestMapping("api/ejemplarlibro")
public class EjemplarLibroController {
    
    @Autowired(required = true)
    private EjemplarLibroService ejemplarLibroServicio;
    
    @RequestMapping(value = "/getAll")
    public List<EjemplarLibro> listar() {
        return ejemplarLibroServicio.ObtenerEjemplares();
    }
    
    @PostMapping
    public EjemplarLibro crear(@RequestBody EjemplarLibro ejemplarLibro) {
        return ejemplarLibroServicio.AgregarEjemplar(ejemplarLibro);
    }
    
    @PutMapping
    public EjemplarLibro actualizar(@RequestBody EjemplarLibro ejemplarLibro) {
        return ejemplarLibroServicio.ActualizarEjemplar(ejemplarLibro);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody EjemplarLibro ejemplarLibro) {
        ejemplarLibroServicio.EliminarEjemplar(ejemplarLibro);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/ejemplarLibro/123*/
    public Optional<EjemplarLibro> obtenerPorID(@PathVariable String id) {
        return ejemplarLibroServicio.ObtenerEjemplarPorId(id);
    }
}
