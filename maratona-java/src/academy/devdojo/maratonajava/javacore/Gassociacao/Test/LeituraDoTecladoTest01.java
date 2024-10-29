package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SEU NOME ABAIXO: ");
        String nome = entrada.next();
        System.out.println("DIGITTE SUA IDADE ABAIXO: ");
        int idade = entrada.nextInt();
        System.out.println("DIGITE (M) OU (F) PARA SEU SEXO: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("----------------------------");
        System.out.println("Seu nome é " + nome + " sua idade é " + idade + " anos, seu sexo é " + sexo);

        if (Character.toLowerCase(sexo) == 'm') {
            System.out.println("MASCULINO");
        } else {
            System.out.println("FEMININO");
        }

        entrada.close();
    }
}
