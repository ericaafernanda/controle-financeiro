package com.fatec.controle_financeiro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExercicioController {

    @GetMapping
    public String HelloWorldId(){
        return "Hello";
    }
    
}
