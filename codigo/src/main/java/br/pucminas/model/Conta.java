import java.util.ArrayList;
import java.util.List;

public class Conta {
    class ContaPoupanca implements Conta {
        // Attributes
        private double saldo;
    
        private List<Transacao> transacoes = new ArrayList<>();
    
        // Constructor
        public Conta() {
            this.saldo = 0.0;
        }

        public Conta(double saldo) {
            this.saldo = saldo;
        }
    
        // Methods
        public double consultarSaldo() {
            return saldo;
        }
    
        public void consultarExtrato() {
            StringBuilder extrato = new StringBuilder("Extrato da Conta Poupança:\n");
            
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
    
        public String saque(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                registrarTransacao("S ", -valor);
                return "Saque efetuado com sucesso.";
            } else {
                return "Não há saldo suficiente.";
            }
        }
    
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