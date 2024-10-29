package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Random;
import java.util.Scanner;

public class ExLeituraDoTecladoTest03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("SOFTWARE DE PREVISÃO DO FUTURO");

        while (true) {
            System.out.println("DIGITE SUA PERGUNTA (ou 'sair' para encerrar): ");
            String pergunta = input.nextLine();

            // Permitir ao usuário sair do loop
            if (pergunta.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado por usar o software de previsão do futuro!");
                break;
            }

            // Gera um número aleatório para decidir a resposta
            int resposta = random.nextInt(2); // 0 ou 1

            if (resposta == 0) {
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
        }

        input.close();
    }
}
