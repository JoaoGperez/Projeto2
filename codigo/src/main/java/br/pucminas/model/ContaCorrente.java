class ContaCorrente implements Conta {
    // Attributes
    private double saldo;
    private double limiteSaqueEspecial = 200.0;
    private double taxaMensal = 20.0;

    private List<Transacao> transacoes = new ArrayList<>();

    // Constructor
    public ContaCorrente() {
        this.saldo = 0.0;
    }

    // Methods
    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void consultarExtrato() {
       StringBuilder extrato = new StringBuilder("Extrato da Conta Poupança:\n");
        
        for (Transacao transacao : transacoes) {
            extrato.append(transacao).append("\n");
        }

        System.out.println(extrato);
    }

    @Override
    public String deposito(double valor) {
        saldo += valor;
        registrarTransacao("D ", valor);
        return "Depósito efetuado com sucesso.";
    }

    @Override
    public String saque(double valor) {
        if (valor <= saldo + limiteSaqueEspecial) {
            saldo -= valor;
            registrarTransacao("S ", -valor);
            return "Saque efetuado com sucesso.";
        } else {
            return "Não há saldo suficiente.";
        }
    }

    @Override
    public String transferencia(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
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
}