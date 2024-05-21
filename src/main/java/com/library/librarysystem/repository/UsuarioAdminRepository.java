package com.library.librarysystem.repository;

import com.library.librarysystem.entities.UsuarioAdmin;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioAdminRepository extends JpaRepository<UsuarioAdmin, String> {
  
    //Retorna un objeto tipo UsuarioAdmin    
    public Optional<UsuarioAdmin> findByUserAdminAndPassAdmin(String userName, String password);
  
  /*@Query(value = "SELECT * FROM usuario_admin WHERE user_admin = %:userName% AND contraseña_admin = %:pass%")
  public Optional<UsuarioAdmin> getUser(String userName, String pass);*/
    
}

