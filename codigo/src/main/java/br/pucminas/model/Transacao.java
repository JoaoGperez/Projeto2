import java.time.LocalDate;

public class Transacao {
    private LocalDate data;
    private String descricao;
    private double valor;

    public Transacao(LocalDate data, String descricao, double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", " + descricao + ", Valor: " + valor;
    }
}