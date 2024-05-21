package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.Libros;
import com.library.librarysystem.services.LibrosService;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/libros")
public class LibrosController {
    
    @Autowired
    private LibrosService libroServicio;
    
    @RequestMapping(value = "/getAll")
    public List<Libros> listar() {
        return libroServicio.ObtenerLibros();
    }
    
    @PostMapping
    public Libros crear(@RequestBody Libros libro) {
        return libroServicio.AgregarLibros(libro);
    }
    
    @PutMapping
    public Libros actualizar(@RequestBody Libros libro) {
        return libroServicio.ActualizarLibros(libro);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Libros libro) {
        libroServicio.EliminarLibros(libro);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/libro/123*/
    public Optional<Libros> obtenerPorID(@PathVariable String id) {
        return libroServicio.ObtenerLibrosPorId(id);
    }
    
    @GetMapping("/titulo")
    @ResponseBody
    public List<Map<String, String>> obtenerPorTitulo(@RequestParam String titulo) {
        return libroServicio.ObtenerLibroPorTitulo(titulo);
    }
    
    @GetMapping("/nuevos")
    public List<Libros> obtenerNuevosLibros() {
        return libroServicio.ObtenerNuevosLibros();
    }
}
