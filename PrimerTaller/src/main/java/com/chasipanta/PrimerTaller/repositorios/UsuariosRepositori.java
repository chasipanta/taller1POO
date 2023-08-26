package com.chasipanta.PrimerTaller.repositorios;

import com.chasipanta.PrimerTaller.entidad.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepositori extends JpaRepository <Usuarios, Integer> {
}
