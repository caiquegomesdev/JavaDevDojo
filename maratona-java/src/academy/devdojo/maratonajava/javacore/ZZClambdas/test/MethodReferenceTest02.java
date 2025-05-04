package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>( List.of(
                new Anime("Berserk", 28),
                new Anime("Vagabond", 8),
                new Anime("VilandSaga", 30),
                new Anime("One piece", 1265)
        ));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
