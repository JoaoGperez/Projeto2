package main.java.br.pucminas.model;

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
        this.cpf = cpf;
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
}



    /*public List<Cliente> getClientesPassados(){
        return clientesPassados;
    }
    public void setClientesPassados(List<Cliente> clientesPassados){
        this.clientesPassados = clientesPassados;
    }
}*/
