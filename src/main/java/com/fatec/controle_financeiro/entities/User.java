package com.fatec.controle_financeiro.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class User {
    private int id;
    private String nome;
    private  Integer idade;

    @NotBlank(message = "O nome não pode estar em branco.")
    @NotNull(message = "A idade é obrigatória.")    

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
