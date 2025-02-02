package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(13);
        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(3L,"Villand Saga",9.5));
        mangas.add(new Manga(1L,"Berserk",29.9));
        mangas.add(new Manga(4L,"Ousama Ranking",18.9));
        mangas.add(new Manga(6L,"Hunte X Hunter",20.0));
        mangas.add(new Manga(8L,"Cowboy bebop",12.5));
        mangas.add(new Manga(7L,"Akira",20.9));
        mangas.add(new Manga(10L,"One punchman",10.0));
        mangas.add(new Manga(12L,"Dandadan",15.0));
        mangas.add(new Manga(11L,"Mob psycho 100",10.0));
        mangas.add(new Manga(13L,"One piece",20.9));
    }
}
