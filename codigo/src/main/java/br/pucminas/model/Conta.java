package main.java.br.pucminas.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

abstract class Conta {
    private double saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public Conta() {
        this.saldo = 0.0;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consultarExtrato() {
        StringBuilder extrato = new StringBuilder("Extrato da Conta:\n");

        for (Transacao transacao : transacoes) {
            extrato.append(transacao).append("\n");
        }

        extrato.toString();
    }

    public String deposito(double valor) {
        saldo += valor;
        registrarTransacao("D ", valor);
        return "Depósito efetuado com sucesso.";
    }

 public boolean saque(double valor) {
    if (valor <= saldo) {
        saldo -= valor;
        registrarTransacao("S ", -valor);
        return true;  // Withdrawal was successful
    } else {
        return false;  // Withdrawal failed due to insufficient balance
    }
}


    public String transferencia(Conta destino, double valor) {
        if (saque(valor)) {
            destino.deposito(valor);
            registrarTransacao("T ", -valor);
            return "Transferência efetuada com sucesso.";
        } else {
            return "Não foi possível realizar esta transferência.";
        }
    }

    private void registrarTransacao(String descricao, double valor) {
        Transacao transacao = new Transacao(LocalDate.now(), descricao, valor);
        transacoes.add(transacao);
    }
}
