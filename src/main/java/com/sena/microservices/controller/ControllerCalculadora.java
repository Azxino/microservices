package com.sena.microservices.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/calculadora")
public class ControllerCalculadora {

    // =========================
    // REQUEST PARAM
    // =========================

    @GetMapping("/sumar")
    public int sumarParam(@RequestParam int a, @RequestParam int b) {

        return a + b;
    }

    @GetMapping("/restar")
    public int restarParam(@RequestParam int a, @RequestParam int b) {

        return a - b;
    }

    @GetMapping("/multiplicar")
    public int multiplicarParam(@RequestParam int a, @RequestParam int b) {

        return a * b;
    }

    @GetMapping("/dividir")
    public String dividirParam(@RequestParam int a, @RequestParam int b) {

        if (b == 0) {
            return "No se puede dividir entre 0";
        }

        return String.valueOf(a / b);
    }

    // =========================
    // REQUEST BODY
    // =========================

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

    // =========================
    // PATH VARIABLE
    // =========================

    @GetMapping("/sumar/{a}/{b}")
    public int sumarPath(@PathVariable int a, @PathVariable int b) {

        return a + b;
    }

    @GetMapping("/restar/{a}/{b}")
    public int restarPath(@PathVariable int a, @PathVariable int b) {

        return a - b;
    }

    @GetMapping("/multiplicar/{a}/{b}")
    public int multiplicarPath(@PathVariable int a, @PathVariable int b) {

        return a * b;
    }

    @GetMapping("/dividir/{a}/{b}")
    public double dividirPath(@PathVariable double a, @PathVariable double b) {

        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }

        return a / b;
    }

    // SUMAR DOS NÚMEROS POR URL CON POST
    @PostMapping("/sumar/{a}/{b}")
     public int sumar(@PathVariable int a ,
                       @PathVariable int b){
        return a + b;
    }
    // SUMAR DOS NÚMEROS POR HEADER CON POST
    @PostMapping("/sumar-header")
    public int sumarHeader(@RequestHeader int a,
                           @RequestHeader int b) {

        return a + b;
    }

}