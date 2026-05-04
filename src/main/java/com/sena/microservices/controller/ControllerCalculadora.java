package com.sena.microservices.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/calculadora")
public class ControllerCalculadora {


    //  PARAM


    @GetMapping("/sumar")
    public int sumar(@RequestParam int a,@RequestParam int b){
        return a + b;
    }

    @GetMapping("/restar")
    public int restar(@RequestParam int a ,@RequestParam int b){
        return a - b;
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a , @RequestParam int b){
        return a * b;
    }

    @GetMapping("/division")
    public String dividir(@RequestParam int a ,@RequestParam int b){
        if (b == 0 ){
            return "No se puede dividir entre 0";
        }
        return String.valueOf(a / b);
    }


    //  BODY


    @PostMapping("/sumar-body")
    public int sumarBody(@RequestBody Map<String, Integer> datos) {
        return datos.get("a") + datos.get("b");
    }

    @PostMapping("/restar-body")
    public int restarBody(@RequestBody Map<String, Integer> datos) {
        return datos.get("a") - datos.get("b");
    }

    @PostMapping("/multiplicar-body")
    public int multiplicarBody(@RequestBody Map<String, Integer> datos) {
        return datos.get("a") * datos.get("b");
    }

    @PostMapping("/dividir-body")
    public String dividirBody(@RequestBody Map<String, Integer> datos) {

        int a = datos.get("a");
        int b = datos.get("b");

        if (b == 0) {
            return "No se puede dividir entre 0";
        }

        return String.valueOf(a / b);
    }
}