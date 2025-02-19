package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {return o1.getMarca().compareTo(o2.getMarca());}
}

class MangaPrecoComparator implements  Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2){
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSeTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>();
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
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

        Manga yuyu = new Manga(21,"YUYU HAKUSHO",8,5);

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println("----------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
