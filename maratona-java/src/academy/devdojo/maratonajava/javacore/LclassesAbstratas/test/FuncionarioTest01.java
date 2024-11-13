package academy.devdojo.maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Zoro",2000);
        Gerente gerente = new Gerente("Nami",5000);
        System.out.println(funcionario);
        System.out.println(gerente);

    }
}
