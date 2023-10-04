class ContaCorrente implements Conta {
    // Attributes
    private double saldo;
    private double limiteSaqueEspecial = 200.0;
    private double taxaMensal = 20.0;

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
        StringBuilder stringBuilder = new StringBuilder();
        // add movimentacao da conta
        System.out.println(stringBuilder);
    }

    @Override
    public String deposito(double valor) {
        saldo += valor;
        return "Depósito efetuado com sucesso.";
    }

    @Override
    public String saque(double valor) {
        if (valor <= saldo + limiteSaqueEspecial) {
            saldo -= valor;
            return "Saque efetuado com sucesso.";
        } else {
            return "Não há saldo suficiente.";
        }
    }

    @Override
    public String transferencia(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return "Transferência efetuada com sucesso.";

        } else {
            return "Não foi possível realizar esta transferência."; 
        }
    }
}