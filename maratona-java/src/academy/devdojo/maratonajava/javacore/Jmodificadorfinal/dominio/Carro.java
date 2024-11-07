package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;//final = constante
    public final Comprador COMPRADOR = new Comprador();//a ref desse obj nunca poderar se alterada

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
