package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 24 de Agosto");
        endereco.setCep("41235-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Izuko Midorya");
        pessoa.setCpf(" 4129002002");
        pessoa.setEndereco(endereco);
    }
}
