package com.library.librarysystem.repository;

import com.library.librarysystem.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, String> {
    
}
