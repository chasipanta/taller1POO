package com.chasipanta.PrimerTaller.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/loging")
    public  String loging(){
        return "loging";
    }
    @GetMapping("/paginasStriming")

    public String paginasStriming(){
        return "paginasStriming";
    }

}
