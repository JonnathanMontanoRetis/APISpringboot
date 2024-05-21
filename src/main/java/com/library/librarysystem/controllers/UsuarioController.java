
package com.library.librarysystem.controllers;

import com.library.librarysystem.entities.Usuario;
import com.library.librarysystem.services.UsuarioService;
import java.util.List;
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
@RequestMapping("api/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioServicio;
    
    @RequestMapping(value = "/getAll")
    public List<Usuario> listar() {
        return usuarioServicio.ObtenerUsuario();
    }
    
    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioServicio.AgregarUsuario(usuario);
    }
    
    @PutMapping
    public Usuario actualizar(@RequestBody Usuario usuario) {
        return usuarioServicio.ActualizarUsuario(usuario);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Usuario usuario) {
        usuarioServicio.EliminarUsuario(usuario);
    }
    
    /* Lo adicional definido en el servicio */
    @GetMapping("{id}")
    /*localhost:8080/api/usuario/123*/
    public Optional<Usuario> obtenerPorID(@PathVariable String id) {
        return usuarioServicio.ObtenerUsuarioPorId(id);
    }
    
    @GetMapping("/email")
    @ResponseBody
    public Optional<Usuario> obtenerPorEmail(@RequestParam String email) {
        return usuarioServicio.ObtenerUsuarioPorEmail(email);
    }
}