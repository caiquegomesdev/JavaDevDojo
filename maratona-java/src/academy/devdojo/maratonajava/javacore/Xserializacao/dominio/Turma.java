package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

public class Turma {
    private String nome;

    public Turma(String nome) {
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
