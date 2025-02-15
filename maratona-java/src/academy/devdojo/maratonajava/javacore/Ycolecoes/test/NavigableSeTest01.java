package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSeTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>();
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on titan",19.9));
        mangas.add(new Manga(3L,"Villand Saga",9.5));
        mangas.add(new Manga(1L,"Berserk",29.9));
        mangas.add(new Manga(4L,"Ousama Ranking",18.9));
        mangas.add(new Manga(6L,"Hunte X Hunter",20.0));
        mangas.add(new Manga(8L,"Cowboy bebop",12.5));
        mangas.add(new Manga(7L,"Akira",20.9));
        mangas.add(new Manga(10L,"One punchman",10.0));
        mangas.add(new Manga(9L,"Dandadan",15.0));
        mangas.add(new Manga(2L,"Mob psycho 100",10.0));
        mangas.add(new Manga(11L,"One piece",20.9));
        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
