package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1A2EDF3","SAMSUNG" );
        Smartphone s2 = s1;
        System.out.println(s1.equals(s2));
    }
}
