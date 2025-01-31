package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "IPHONE");
        Smartphone s2 = new Smartphone("22222", "PIXEL");
        Smartphone s3 = new Smartphone("33333", "SAMSUNG");
        Smartphone s4 = new Smartphone("44444", "XIAOMI");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(s4);
    }
}
