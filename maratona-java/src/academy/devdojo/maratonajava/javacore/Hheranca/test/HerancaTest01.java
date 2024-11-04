package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 24 de Agosto");
        endereco.setCep("41235-000");
        Pessoa pessoa = new Pessoa("Izuko Midorya");

        pessoa.setCpf(" 4129002002");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("--------------------------");

        Funcionario funcionario = new Funcionario("Monkey D. Luffy");

        funcionario.setCpf("300000000000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
