package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Attack on titan",19.9, 0));
        mangas.add(new Manga(3L,"Villand Saga",9.5,5));
        mangas.add(new Manga(1L,"Berserk",29.9,0));
        mangas.add(new Manga(4L,"Ousama Ranking",18.9,2));
        mangas.add(new Manga(6L,"Hunte X Hunter",20.0,4));
        mangas.add(new Manga(8L,"Cowboy bebop",12.5,0));
        mangas.add(new Manga(7L,"Akira",20.9,2));

        for(Manga manga; mangas){
            System.out.println(manga);
        }
    }

}
