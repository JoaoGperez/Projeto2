package main.java.br.pucminas.model;

public class ContaInvestimento extends Conta {
    // Attributes
    private double rendimentoDiario;
    private double imposto = 0.15;

    // Constructor
    public ContaInvestimento(double saldoInicial, double rendimentoDiario) {
        super(saldoInicial);
        this.rendimentoDiario = rendimentoDiario;
    }


    public String saque(double valor) {
        if (valor <= saldo) {
            double rendimento = saldo * rendimentoDiario;
            double valorLiquido = valor - (valor * imposto);

            saldo -= valor;
            saldo += rendimento;
            registrarTransacao("S ", -valor);
            registrarTransacao("R ", rendimento);
            registrarTransacao("I ", valor - valorLiquido);

            return "Saque efetuado com sucesso.";
        } else {
            return "Não há saldo suficiente.";
        }
    }
}