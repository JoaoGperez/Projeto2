package main.java.br.pucminas.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String cpf;
    private String nome;
    private String senha;

    public Cliente(String cpf, String nome, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String setCpf(String cpf) {
        return this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

      private List<Conta> contas = new ArrayList<>(); // List to store the client's accounts


    public List<Conta> getContas() {
        return contas;
    }

    // Method to add a Conta to the list of the client's accounts
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}



