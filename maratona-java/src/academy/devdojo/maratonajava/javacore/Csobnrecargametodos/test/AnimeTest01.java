package academy.devdojo.maratonajava.javacore.Csobnrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobnrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boku no hero","TV", 20);

        anime.setGenero("Ação");

        anime.imprime();

    }
}
