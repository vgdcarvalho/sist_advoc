package com.company;

import java.util.List;

public class Administrador {

    private String email;
    private String senha;

    public Administrador(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void geraRelatorio(String nome, List<Duvida> advogados){

    }

    public void geraRelatorio(String nome, List<Processo> duvidas){

    }

    public void geraRelatorio(String nome, List<Processo> processos){

    }
}
