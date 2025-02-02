package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Villand Saga");
        mangas.add("Berserk");
        mangas.add("Ousama Ranking");
        mangas.add("Hunte X Hunter");
        mangas.add("Cowboy bebop");
        mangas.add("Akira");
        mangas.add("One punchman");
        mangas.add("Dandadan");
        mangas.add("Mob psycho 100");
        mangas.add("One piece");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(200.10);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        for(String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);


    }
}
