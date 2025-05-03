package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>( List.of(
                new Anime("Berserk", 28),
                new Anime("Vagabond", 8),
                new Anime("VilandSaga", 30),
                new Anime("One piece", 1265)
        ));

        //Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animeList, AnimeComparators::compareByTitle);


        System.out.println(animeList);
    }


}
