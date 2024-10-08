package com.fatec.controle_financeiro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/exercicios1")
public class ExercicioController {

    @GetMapping("/hello")
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

    //Com requisição de corpo(parametro)
    @PostMapping("/reverter-nome-requisicao-corpo")
    public String reverterNomeRequisicaoCorpo(@RequestBody String nome) {
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
    @GetMapping("/contar-letras/{texto}")
    public int contarLetras(@PathVariable String texto) {
        return texto.replaceAll("\\s+", "").length();
    }
    
    @GetMapping("/idade-com-parametro/{idade}")
    public String faixaEtaria(@PathVariable Integer idade) {
        if (idade < 0) {
            return "IDADE INVÁLIDA";
        }
        else if (idade <= 12) {
            return "CRIANÇA";
        } else if (idade <= 18) {
            return "ADOLESCENTE";
        } else if (idade <= 60) {
            return "ADULTO";
        } else{
            return "IDOSO";
        }
    }
    
    
    public class User {
        private String nome;
        private Integer idade;
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public Integer getIdade() {
            return idade;
        }
        public void setIdade(Integer idade) {
            this.idade = idade;
        }
            
        
    }
}
