public class ContaCorrente extends Conta {
    // Attributes
    private double limiteSaqueEspecial = 200.00;
    private double taxaMensal = 20.00;

    // Methods
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

    private void calcularTaxaMensal() {
        if (valor <= saldo + limiteSaqueEspecial) {
            saldo -= taxaMensal;
            registrarTransacao("TM ", taxaMensal);
        }
    }
 
}
