package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("JujutsuKaisen","TV", 20,"Ação");
        anime.imprime();
//sobrecarga é metodos com o mesmo nome com quantidades ou tipos dos parametros diferentes
    }
}
