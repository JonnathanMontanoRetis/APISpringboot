package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.UsuarioAdmin;
import com.library.librarysystem.services.UsuarioAdminService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("api/usuarioAdmin")
public class UsuarioAdminController {
    
    @Autowired
    private UsuarioAdminService usuarioAdminServicio;
    
    @RequestMapping(value = "/getAll")
    public List<UsuarioAdmin> listar() {
        return usuarioAdminServicio.ObtenerUsuarioAdmin();
    }
    
    @PostMapping
    public UsuarioAdmin crear(@RequestBody UsuarioAdmin usuarioAdmin) {
        return usuarioAdminServicio.AgregarUsuarioAdmin(usuarioAdmin);
    }
    
    @PutMapping
    public UsuarioAdmin actualizar(@RequestBody UsuarioAdmin usuarioAdmin) {
        return usuarioAdminServicio.ActualizarUsuarioAdmin(usuarioAdmin);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody UsuarioAdmin usuarioAdmin) {
        usuarioAdminServicio.EliminarUsuarioAdmin(usuarioAdmin);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/usuarioAdmin/123*/
    public Optional<UsuarioAdmin> obtenerPorID(@PathVariable String id) {
        return usuarioAdminServicio.ObtenerUsuarioAdminPorId(id);
    }
    
    @GetMapping("/login")
    @ResponseBody
    public Optional<UsuarioAdmin> obtenerParaLogin(@RequestParam("user") String username, @RequestParam("password") String pass) {
        return usuarioAdminServicio.ObtenerUsuarioAdminParaLogin(username, pass);
    }
}