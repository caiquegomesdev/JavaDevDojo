package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Caique Gomes");
        nomes.add("Desenvolvedor Java");


        for(String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Fullstack");
        System.out.println("-----------------");

        for (int i = 0; i < nomes.size() ; i++) {
            System.out.println(nomes.get(i));
        }
    }
}
