package academy.devdojo.maratonajava.javacore.ZZEstreams.dominio;

import academy.devdojo.maratonajava.javacore.ZZEstreams.classes.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Naruto",3.99),
            new LightNovel("Berserk",5.00),
            new LightNovel("One Piece",19.99),
            new LightNovel("Boku no hero",10.99),
            new LightNovel("Fullmetall Alchemist",10.99)
    ));


    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTilte));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <=10){
                titles.add(lightNovel.getTilte());
            }
            if(titles.size() >=3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
