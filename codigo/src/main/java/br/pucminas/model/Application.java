import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private List<Cliente> clientes; // Uma lista de clientes do banco

    public BankApplication() {
        clientes = new ArrayList<>();
        // Inicialize a lista de clientes com os clientes existentes
        // Exemplo:
        clientes.add(new Cliente("12345678901", "João", "senha123"));
        clientes.add(new Cliente("98765432109", "Maria", "senha456"));
        // Adicione contas aos clientes
        // Exemplo:
        Conta contaJoao = new ContaCorrente();
        Conta contaMaria = new ContaPoupanca();
        clientes.get(0).adicionarConta(contaJoao);
        clientes.get(1).adicionarConta(contaMaria);
    }

    // Funções para clientes regulares
    public double consultarSaldo(Cliente cliente, Conta conta) {
        // Implementar a lógica para consultar o saldo de uma conta específica
        return conta.consultarSaldo();
    }

    public void consultarExtrato(Cliente cliente, Conta conta) {
        // Implementar a lógica para consultar o extrato de uma conta específica
        conta.consultarExtrato();
    }

    public String deposito(Cliente cliente, Conta conta, double valor) {
        // Implementar a lógica para realizar um depósito em uma conta específica
        return conta.deposito(valor);
    }

    public String saque(Cliente cliente, Conta conta, double valor) {
        // Implementar a lógica para realizar um saque em uma conta específica
        return conta.saque(valor);
    }

    public String transferencia(Cliente clienteRemetente, Conta contaRemetente, Cliente clienteDestinatario, Conta contaDestinatario, double valor) {
        // Implementar a lógica para realizar uma transferência entre contas
        return contaRemetente.transferencia(contaDestinatario, valor);
    }

    // Funções para a diretoria
    public double totalCustodia(Conta conta) {
        // Implementar a lógica para calcular o total em custódia para um tipo de conta
        // Essa função pode percorrer a lista de clientes e somar os saldos de contas do tipo desejado
        return 0.0; // Altere para retornar o valor correto
    }

    public double saldoMedioTodasContas() {
        // Implementar a lógica para calcular o saldo médio de todas as contas
        // Essa função pode percorrer a lista de clientes e calcular a média dos saldos de todas as contas
        return 0.0; // Altere para retornar o valor correto
    }

    public int clientesComSaldoNegativo() {
        // Implementar a lógica para contar o número de clientes com saldo total negativo
        // Essa função pode percorrer a lista de clientes e verificar se o saldo total é negativo
        return 0; // Altere para retornar o valor correto
    }

    public Cliente clienteComMaiorSaldoTotal() {
        // Implementar a lógica para encontrar o cliente com o maior saldo total
        // Essa função pode percorrer a lista de clientes e comparar os saldos totais
        return null; // Altere para retornar o cliente correto
    }

    public Cliente clienteComMenorSaldoTotal() {
        // Implementar a lógica para encontrar o cliente com o menor saldo total
        // Essa função pode percorrer a lista de clientes e comparar os saldos totais
        return null; // Altere para retornar o cliente correto
    }

    public static void main(String[] args) {
        // Crie uma instância de BankApplication e execute as operações desejadas
        BankApplication bankApp = new BankApplication();
        
        // Exemplo de uso:
        Cliente joao = bankApp.clientes.get(0);
        Conta contaJoao = joao.getContas().get(0);

        double saldo = bankApp.consultarSaldo(joao, contaJoao);
        System.out.println("Saldo de João: " + saldo);
    }
}
