package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest {
    public static void main(String... args) {
        Funcionarios funcionario = new Funcionarios();


        funcionario.setNome("Gomes");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 2000.20, 5500.99});
        funcionario.imprimeDados();
        System.out.println("MEdia " + funcionario.getMedia());

    }
}
