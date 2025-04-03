package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Type erasure
        List<String > lista = new ArrayList<>();
        lista.add("Luffy");
        lista.add("Luffy");


        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Luffy"));

    }

    private static void add (List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
