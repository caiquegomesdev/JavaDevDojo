package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "CLIENTE{" +
                " NOME = '" + nome + '\'' +
                ", TIPO CLIENTE = " + tipoCliente.getNomeRelatorio() +
                ", TIPO CLIENTE INT = " + tipoCliente.getValor() +
                ", TIPO PAGAMENTO = " + tipoPagamento +
                '}';
    }
}
