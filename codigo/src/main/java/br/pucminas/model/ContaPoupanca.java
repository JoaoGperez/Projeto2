public class ContaPoupanca extends Conta {
    // Attributes
    private double rendimentoFixo = 0.005;

    // Methods
    public void calcularRendimentoMensal() {
        double rendimento = saldo * rendimentoFixo;
        saldo += rendimento;
        registrarTransacao("RM", rendimento);
    }
}