package com.sena.microservices.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPrueba {

    @GetMapping("/test")
    public String test(){
        return "<h1>Bienvenido a Java Spring</h1>";
    }

    @GetMapping("/test2")
    public int test2(){
        return 10;
    }

    @DeleteMapping("/eliminar")
    public String delete(){
        return "Eliminar";
    }

    @PutMapping("/actualizar")
    public String update(){
        return "Actualizar datos";
    }
}
