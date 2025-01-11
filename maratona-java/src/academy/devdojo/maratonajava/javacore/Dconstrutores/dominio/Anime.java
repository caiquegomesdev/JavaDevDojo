package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

import javax.swing.*;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //      sobrecarga é metodos com o mesmo nome com quantidades ou tipos dos parametros diferentes

    public Anime(String nome, String tipo, int episodios, String genero){
        System.out.println("--DENTRO DO CONSTRUTOR--");
        
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println("NOME: " + this.nome);
        System.out.println("TIPO: " + this.tipo);
        System.out.println("EPISODIOS: " + this.episodios);
        System.out.println("GENERO: " + this.genero);
        System.out.println("ESTUDIO: " + this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
