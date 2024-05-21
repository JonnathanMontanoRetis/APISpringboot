package com.library.librarysystem.services;

import com.library.librarysystem.entities.EjemplarLibro;
import com.library.librarysystem.repository.EjemplarLibroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EjemplarLibroService {
    
    @Autowired
    private EjemplarLibroRepository ejemplarLibroRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public EjemplarLibro AgregarEjemplar(EjemplarLibro ejemplarLibro) {
        return ejemplarLibroRepositorio.save(ejemplarLibro);
    }
    
    /*R = Read*/
    public List<EjemplarLibro> ObtenerEjemplares() {
        return ejemplarLibroRepositorio.findAll();
    }
    
    /*U = Update */
    public EjemplarLibro ActualizarEjemplar(EjemplarLibro ejemplarLibro) {
        return ejemplarLibroRepositorio.save(ejemplarLibro);
    }
    
    /*D = Delete*/
    public void EliminarEjemplar(EjemplarLibro ejemplarLibro) {
        ejemplarLibroRepositorio.delete(ejemplarLibro);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<EjemplarLibro> ObtenerEjemplarPorId(String id) {
        return ejemplarLibroRepositorio.findById(id);
    }
}
