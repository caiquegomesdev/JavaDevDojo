package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa","pessoa fisica");
        Cliente cliente2 = new Cliente("Myamoto", "Pessa Juridica");
        Cliente cliente3 = new Cliente("Shikamaru", "PESSOA_FISICA");
        Cliente cliente4 = new Cliente("Atena", "PESSOA_JURIDICA");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
