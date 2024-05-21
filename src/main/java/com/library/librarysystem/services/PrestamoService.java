package com.library.librarysystem.services;

import com.library.librarysystem.entities.Prestamo;
import com.library.librarysystem.repository.PrestamoRepository;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamoService {
    
    @Autowired
    private PrestamoRepository prestamoRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public Prestamo AgregarPrestamo(Prestamo prestamo) {
        return prestamoRepositorio.save(prestamo);
    }
    
    /*R = Read*/
    public List<Prestamo> ObtenerPrestamo() {
        return prestamoRepositorio.findAll();
    }
    
    /*U = Update */
    public Prestamo ActualizarPrestamo(Prestamo prestamo) {
        return prestamoRepositorio.save(prestamo);
    }
    
    /*D = Delete*/
    public void EliminarPrestamo(Prestamo prestamo) {
        prestamoRepositorio.delete(prestamo);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<Prestamo> ObtenerPrestamoPorId(String id) {
        return prestamoRepositorio.findById(id);
    }
    
    public String ObtenerUltimoPrestamo() {
        return prestamoRepositorio.getLastIdPrestamo();
    }
    
    public List<Prestamo> ObtenerPrestamos() {
        return prestamoRepositorio.getPrestamosRegistrados();
    }
    
    public List<Map<String, Integer>> ObtenerPrestamosPorMes(Integer year) {
        return prestamoRepositorio.getPrestamosPorMes(year);
    }
    
    public List<Map<String, Integer>> ObtenerDevolucionesPorMes(Integer year) {
        return prestamoRepositorio.getDevolucionesPorMes(year);
    }
    
    public List<Map<String, String>> ObtenerPrestamosDiarios() {
        return prestamoRepositorio.getPrestamosDiarios();
    }
}
