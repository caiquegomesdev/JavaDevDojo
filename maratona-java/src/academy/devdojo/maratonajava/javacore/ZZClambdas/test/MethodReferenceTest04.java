package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;


public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimecomparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimecomparators.get();
        List<Anime> animeList = new ArrayList<>( List.of(
                new Anime("Berserk", 28),
                new Anime("Vagabond", 8),
                new Anime("VilandSaga", 30),
                new Anime("One piece", 1265)
        ));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Jujutsu Kaisen", 36));
    }
}
