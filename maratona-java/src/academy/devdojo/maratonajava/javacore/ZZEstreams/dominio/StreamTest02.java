package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import academy.devdojo.maratonajava.javacore.ZZEstreams.classes.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Naruto",3.99),
            new LightNovel("Berserk",5.00),
            new LightNovel("One Piece",19.99),
            new LightNovel("Boku no hero",10.99),
            new LightNovel("Fullmetall Alchemist",10.99)
    ));


    public static void main(String[] args) {
        lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTilte))
                .filter(ln -> ln.getPrice() <= 10)
                .limit(3)
                .map(LightNovel::getTilte);

    }
}
