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
        
    }
}
