package com.fatec.controle_financeiro.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fatec.controle_financeiro.controllers.ExercicioController.User;

import jakarta.validation.Valid;

@RestControllerAdvice
@RestController
@RequestMapping("/api/usuario")
public class usuarioController { 

/*
public class ResponseAdviceController{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException);

}
*/
    
    /*http://localhost:<port>/api/usuario/register
    POST
    Parâmetro: @RequestMapping => enviar no corpo da requisição

    @PostMapping => POST - CRIAÇÃO / consultas om paramentros no corpo da requisição
    @GetMapping => GET - consultas
    @PutMapping => PUT - alteração
    @DeleteMapping => DELETE - deletar
    @PatchMapping => PATCH -     
    */ 
    
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid@RequestBody User usuario) {
        if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Usuário inválido!");
        }
        if (usuario.getIdade() <= 0) {
            return ResponseEntity.badRequest().body("Idade inválida");
        }

        return ResponseEntity.ok("Bem-vindo, " + usuario.getNome() + "! Você tem " + usuario.getIdade() + " anos.");
    }
    
    /*
    @PostMapping("/register/{nome}{idade}")
    public String RegisterUser(@PathVariable String nome, @PathVariable int idade) {
        User usuario = new User();
        usuario.setNome(nome);
        usuario.setIdade(idade);

        return "Bem-vindo, " + usuario.getNome() + "! Você tem " + usuario.getIdade() + " anos.";
    }*/
    
}
