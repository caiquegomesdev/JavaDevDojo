package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Caique ");
        nomes.add("Desenvolvedor ");
        nomes2.add(" Gomes");
        nomes2.add(" Java");

        System.out.println(nomes.remove("Caique") );

        nomes.addAll(nomes2);
        
        for(String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Fullstack");
        System.out.println("-----------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
            nomes.add("Fullstack");
        }
        System.out.println(nomes);
        System.out.println("-----------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}
