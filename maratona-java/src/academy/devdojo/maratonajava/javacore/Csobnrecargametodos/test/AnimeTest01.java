package academy.devdojo.maratonajava.javacore.Csobnrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobnrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boku no hero","TV", 20);
        anime.init("Boku no hero","TV", 20,"Ação");
        anime.imprime();
//sobrecarga é metodos com o mesmo nome com quantidades ou tipos dos parametros diferentes
    }
}
