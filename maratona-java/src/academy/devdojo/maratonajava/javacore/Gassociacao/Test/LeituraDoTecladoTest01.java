package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE SEU NOME ABAIXO: ");
        String next = entrada.next();
        System.out.println("Seu nome é " + next);
        System.out.println("----------------------------");
        System.out.println("DIGITTE SUA IDADE ABAIXO: ");
        


        entrada.close();
    }
}
