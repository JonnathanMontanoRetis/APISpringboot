package com.library.librarysystem.services;

import com.library.librarysystem.entities.AutorLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.librarysystem.repository.AutorLibroRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AutorLibroService {
    @Autowired
    private AutorLibroRepository autorLibroRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public AutorLibro AgregarAutorLibro(AutorLibro autorLibro) {
        return autorLibroRepositorio.save(autorLibro);
    }
    
    /*R = Read*/
    public List<AutorLibro> ObtenerAutorLibro() {
        return autorLibroRepositorio.findAll();
    }
    
    /*U = Update */
    public AutorLibro ActualizarAutorLibro(AutorLibro autorLibro) {
        return autorLibroRepositorio.save(autorLibro);
    }
    
    /*D = Delete*/
    public void EliminarAutorLibro(AutorLibro autorLibro) {
        autorLibroRepositorio.delete(autorLibro);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<AutorLibro> ObtenerAutorLibroPorId(String id) {
        return autorLibroRepositorio.findById(id);
    }
}
