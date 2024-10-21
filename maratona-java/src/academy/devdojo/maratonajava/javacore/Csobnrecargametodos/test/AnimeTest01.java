package academy.devdojo.maratonajava.javacore.Csobnrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobnrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("My hero Academy");
        anime.setTipo("TV");
        anime.setEpisodios(20);
        anime.imprime();

    }
}
