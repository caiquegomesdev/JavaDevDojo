package academy.devdojo.maratonajava.javacore.Zgenerics.dominio;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    public Barco(String canoa, Barco lancha) {
    }


    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
