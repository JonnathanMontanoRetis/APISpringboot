
package com.library.librarysystem.repository;

import com.library.librarysystem.entities.Prestamo;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PrestamoRepository extends JpaRepository<Prestamo, String>{
    @Query(value = "SELECT id_reserva FROM prestamo ORDER BY id_reserva DESC LIMIT 1", nativeQuery = true)
    String getLastIdPrestamo();
    
    @Query(value = "SELECT * FROM prestamo WHERE estado = 'No disponible' ORDER BY id_reserva DESC", nativeQuery = true)
    List<Prestamo> getPrestamosRegistrados();
    
    @Query(value = "SELECT DATE_PART('month', fecha_prestamo) AS mes_prestamo, COUNT(id_ejemplar) AS ejemplares FROM prestamo WHERE DATE_PART('year', fecha_prestamo) = ?1 GROUP BY DATE_PART('month', fecha_prestamo)", nativeQuery = true)
    List<Map<String, Integer>> getPrestamosPorMes(Integer year);
    
    @Query(value = "SELECT DATE_PART('month', fecha_devolucion) AS mes_devolucion, COUNT(id_ejemplar) AS ejemplares FROM prestamo WHERE DATE_PART('year', fecha_devolucion) = ?1 AND estado = 'Disponible' GROUP BY DATE_PART('month', fecha_devolucion)", nativeQuery = true)
    List<Map<String, Integer>> getDevolucionesPorMes(Integer year);
    
    @Query(value = "SELECT p.fecha_prestamo, l.titulo FROM prestamo p INNER JOIN ejemplar_libro el ON el.id_ejemplar = p.id_ejemplar INNER JOIN libro l ON l.cod_inv = el.cod_inv WHERE p.fecha_prestamo = current_date", nativeQuery = true)
    List<Map<String, String>> getPrestamosDiarios();
}
