package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicializacao estatico da superclasse é executado quando JVM carregar a classe
    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao");
    }
}
