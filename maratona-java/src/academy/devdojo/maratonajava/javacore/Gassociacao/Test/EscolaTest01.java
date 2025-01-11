package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("All Might Sensei");
        Professor professor2 = new Professor("Endeavor Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Colegio U.A.", professores);

        escola.imprime();
    }
}
