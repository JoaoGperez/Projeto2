interface Conta {
    double consultarSaldo();
    void consultarExtrato();
    String deposito(double valor);
    String saque(double valor);
    String transferencia(Conta destino, double valor);
}