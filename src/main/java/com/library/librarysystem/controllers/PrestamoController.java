package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.Prestamo;
import com.library.librarysystem.services.PrestamoService;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/prestamos")
public class PrestamoController {
    
    @Autowired
    private PrestamoService prestamoServicio;
    
    @RequestMapping(value = "/getAll")
    public List<Prestamo> listar() {
        return prestamoServicio.ObtenerPrestamo();
    }
    
    @PostMapping
    public Prestamo crear(@RequestBody Prestamo prestamo) {
        return prestamoServicio.AgregarPrestamo(prestamo);
    }
    
    @PutMapping
    public Prestamo actualizar(@RequestBody Prestamo prestamo) {
        return prestamoServicio.ActualizarPrestamo(prestamo);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Prestamo prestamo) {
        prestamoServicio.EliminarPrestamo(prestamo);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/prestamo/123*/
    public Optional<Prestamo> obtenerPorID(@PathVariable String id) {
        return prestamoServicio.ObtenerPrestamoPorId(id);
    }
    
    @RequestMapping(value = "/getLastId")
    public String ultimoPrestamo() {
        return prestamoServicio.ObtenerUltimoPrestamo();
    }
    
    @RequestMapping(value = "/lista-prestamos")
    public List<Prestamo> prestamos() {
        return prestamoServicio.ObtenerPrestamos();
    }
    
    @GetMapping("/prestamos-mes")
    public List<Map<String, Integer>> obtenerPrestamosPorMes(@RequestParam Integer year) {
        return prestamoServicio.ObtenerPrestamosPorMes(year);
    }
    
    @GetMapping("/prestamos-dia")
    public List<Map<String, String>> obtenerPrestamosDiarios() {
        return prestamoServicio.ObtenerPrestamosDiarios();
    }
    
    @GetMapping("/devoluciones-mes")
    public List<Map<String, Integer>> obtenerDevolucionesPorMes(@RequestParam Integer year) {
        return prestamoServicio.ObtenerDevolucionesPorMes(year);
    }
}