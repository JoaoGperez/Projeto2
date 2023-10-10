public class ContaRendaFixa extends Conta {
    // Attributes
    private double rendimentoContratado;
    private double imposto = 0.15;

    // Construtor
    public ContaRendaFixa(double rendimentoContratado) {
        super();
        this.rendimentoContratado = rendimentoContratado;
    }

    @Override
    public String saque(double valor) {
        if (valor <= saldo) {
            double rendimento = (saldo - valor) * (rendimentoContratado / 100);
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