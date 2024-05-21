/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.library.librarysystem.repository;

import com.library.librarysystem.entities.EjemplarLibro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjemplarLibroRepository extends JpaRepository<EjemplarLibro, String> {
    
}
