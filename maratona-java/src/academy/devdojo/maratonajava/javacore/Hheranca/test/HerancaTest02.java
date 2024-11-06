package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da superclasse é executado quando JVM carregar a classe pai
    // 1 - Bloco de inicialização estatico da superclasse é executado quando JVM carregar a classe filha
    // 2 - Alocado espaco em memoria pro objeto
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização é executado
    // 5 - Construtor é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao");
    }
}
