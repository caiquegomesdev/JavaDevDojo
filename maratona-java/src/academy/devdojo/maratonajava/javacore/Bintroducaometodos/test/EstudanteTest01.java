package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Bakugo";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Akame";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
