package com.fatec.controle_financeiro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/exercicios1")
public class ExercicioController {

    @GetMapping
    public String HelloWorldId(){
        return "Hello";
    }

    //@PathVariable = anotação para definir que a variável nome é do
    //tipo String será recebida pelo parâmetro{nome}
    //WEB - http://localhost:8090/api/exercicios1/reverter-nome/erica
    @GetMapping("/reverter-nome/{nome}")
    public String reverternome(@PathVariable String nome) {
        return new StringBuilder(nome).reverse().toString();
    }

    // WEB - http://localhost:8090/api/exercicios1/par-ou-impar/6
    @GetMapping("/par-ou-impar/{numero}")
    public String verificarParOuImpar(@PathVariable Integer numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else{
            return "Ímpar";
        }        
    }
    
    
}
