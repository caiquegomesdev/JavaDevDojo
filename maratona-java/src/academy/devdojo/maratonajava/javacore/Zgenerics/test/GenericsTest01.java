package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Luffy");
        lista.add(123L);
        lista.add(new Consumidor("Goku"));

        for (Object o : lista) {
            if(o instanceof String){
                System.out.println(o);
            }
            if (o instanceof Long){
                System.out.println(o);
            }
            if (o instanceof Consumidor){
                Consumidor c = (Consumidor) o;
                System.out.println(c);
            }

        }

    }
}
