package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Caique Gomes");
        Consumidor consumidor2 = new Consumidor("DEVGOMES");

        NavigableMap<String, Consumidor> map = new TreeMap<>();
            map.put("A", consumidor1);
            map.put("D", consumidor2);
//        map.put("B", "Letra B");
//        map.put("C", "Letra C");
//        map.put("E", "Letra E");

        for (Map.Entry<String, Consumidor> entry: map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

}
