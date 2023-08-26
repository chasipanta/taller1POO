package com.chasipanta.PrimerTaller.controlador;

import com.chasipanta.PrimerTaller.entidad.Usuarios;
import com.chasipanta.PrimerTaller.repositorios.UsuariosRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
 public class UsuariosControlador {
      @Autowired
      UsuariosRepositori usuariosRepositori;
    @GetMapping("/registro")
    public String registro(Model model){
        model.addAttribute("registro", new Usuarios());

        return "registro";
    }
    @GetMapping("/usuarios")
    public String usuarios(Model model){
        List<Usuarios> usuarios = usuariosRepositori.findAll();
        model.addAttribute("usuarios",usuarios);
        return "usuarios";
    }

    @PostMapping("/registro")
    public String crear(Usuarios usuarios){
        usuariosRepositori.save(usuarios);
        return "redirect://usuarios";
    }

}
