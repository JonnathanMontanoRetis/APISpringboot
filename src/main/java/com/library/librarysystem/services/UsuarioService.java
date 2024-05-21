package com.library.librarysystem.services;

import com.library.librarysystem.entities.Usuario;
import com.library.librarysystem.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public Usuario AgregarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }
    
    /*R = Read*/
    public List<Usuario> ObtenerUsuario() {
        return usuarioRepositorio.findAll();
    }
    
    /*U = Update */
    public Usuario ActualizarUsuario(Usuario usuario) { return usuarioRepositorio.save(usuario); }
    
    /*D = Delete*/
    public void EliminarUsuario(Usuario usuario) {
        usuarioRepositorio.delete(usuario);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<Usuario> ObtenerUsuarioPorId(String id) {
        return usuarioRepositorio.findById(id);
    }
    
    public Optional<Usuario> ObtenerUsuarioPorEmail(String email) {
        return usuarioRepositorio.findByCorreo(email);
    }
}
