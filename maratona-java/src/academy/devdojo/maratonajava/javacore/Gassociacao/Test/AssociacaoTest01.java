package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua 24 de Agosto");
        Aluno aluno = new Aluno("Caique Gomes", 25);
        Professor professor = new Professor("William Suane", "Java");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("COMO SE TORNAR PROGRAMADOR JAVA", alunosParaSeminario, local );

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
