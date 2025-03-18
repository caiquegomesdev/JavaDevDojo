package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Caique Gomes");
        Consumidor consumidor2 = new Consumidor("DEVGOMES");

        Manga manga1 = new Manga(5L, "Attack on titan", 19.9);
        Manga manga2 =new Manga(3L,"Villand Saga",9.5);
        Manga manga3 =new Manga(1L,"Berserk",29.9);
        Manga manga4 =new Manga(4L,"Ousama Ranking",18.9);
        Manga manga5 =new Manga(6L,"Hunte X Hunter",20.0);
        Manga manga6 =new Manga(11L,"One piece",20.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() +" - "+ entry.getValue().getNome());
        }
    }
}
