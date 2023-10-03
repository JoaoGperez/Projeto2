package main.java.br.pucminas;


public class Cliente {

    public int cpf;
    public String nome;

    public Cliente(int cpf, String nome){
    
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}



    /*public List<Cliente> getClientesPassados(){
        return clientesPassados;
    }
    public void setClientesPassados(List<Cliente> clientesPassados){
        this.clientesPassados = clientesPassados;
    }
}*/
