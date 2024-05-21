package com.library.librarysystem.repository;
import com.library.librarysystem.entities.Libros;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LibrosRepository extends JpaRepository<Libros, String>{
    @Query(value = "SELECT el.id_ejemplar, l.titulo FROM libro l INNER JOIN ejemplar_libro el ON el.cod_inv = l.cod_inv WHERE l.titulo ILIKE %?1%", nativeQuery = true)
    List<Map<String, String>> getBookByTitle(String titulo);
    
    @Query(value = "SELECT * FROM libro ORDER BY fecha_creacion DESC LIMIT 5", nativeQuery = true)
    List<Libros> getNuevosLibros();
}
