package com.library.librarysystem.services;

import com.library.librarysystem.entities.UsuarioAdmin;
import com.library.librarysystem.repository.UsuarioAdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioAdminService {
    
    @Autowired
    private UsuarioAdminRepository usuarioAdminRepositorio;
    
    /* CRUD */
    /*C = Create*/
    public UsuarioAdmin AgregarUsuarioAdmin(UsuarioAdmin usuarioAdmin) {
        return usuarioAdminRepositorio.save(usuarioAdmin);
    }
    
    /*R = Read*/
    public List<UsuarioAdmin> ObtenerUsuarioAdmin() {
        return usuarioAdminRepositorio.findAll();
    }
    
    /*U = Update */
    public UsuarioAdmin ActualizarUsuarioAdmin(UsuarioAdmin usuarioAdmin) {
        return usuarioAdminRepositorio.save(usuarioAdmin);
    }
    
    /*D = Delete*/
    public void EliminarUsuarioAdmin(UsuarioAdmin usuarioAdmin) {
        usuarioAdminRepositorio.delete(usuarioAdmin);
    }
    
    /* Todo lo que se te ocurra */
    public Optional<UsuarioAdmin> ObtenerUsuarioAdminPorId(String id) {
        return usuarioAdminRepositorio.findById(id);
    }
    
    public Optional<UsuarioAdmin> ObtenerUsuarioAdminParaLogin(String username,String pass) {
       return usuarioAdminRepositorio.findByUserAdminAndPassAdmin(username, pass); 
    }
}
