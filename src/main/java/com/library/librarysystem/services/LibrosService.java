package com.library.librarysystem.services;

import com.library.librarysystem.entities.Libros;
import com.library.librarysystem.repository.LibrosRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibrosService {
    
    @Autowired
    private LibrosRepository libroRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public Libros AgregarLibros(Libros libro) {
        return libroRepositorio.save(libro);
    }
    
    /*R = Read*/
    public List<Libros> ObtenerLibros() {
        return libroRepositorio.findAll();
    }
    
    /*U = Update */
    public Libros ActualizarLibros(Libros libro) {
        return libroRepositorio.save(libro);
    }
    
    /*D = Delete*/
    public void EliminarLibros(Libros libro) {
        libroRepositorio.delete(libro);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<Libros> ObtenerLibrosPorId(String id) {
        return libroRepositorio.findById(id);
    }
    
    public List<Map<String, String>> ObtenerLibroPorTitulo(String titulo) {
        return libroRepositorio.getBookByTitle(titulo);
    }
    
    public List<Libros> ObtenerNuevosLibros() {
        return libroRepositorio.getNuevosLibros();
    }
}
