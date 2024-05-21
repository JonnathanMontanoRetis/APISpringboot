package com.library.librarysystem.services;

import com.library.librarysystem.entities.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.librarysystem.repository.AutorRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public Autor AgregarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }
    
    /*R = Read*/
    public List<Autor> ObtenerAutores() {
        return autorRepositorio.findAll();
    }
    
    /*U = Update */
    public Autor ActualizarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }
    
    /*D = Delete*/
    public void EliminarAutor(Autor autor) {
        autorRepositorio.delete(autor);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<Autor> ObtenerAutorPorId(String id) {
        return autorRepositorio.findById(id);
    }
}
