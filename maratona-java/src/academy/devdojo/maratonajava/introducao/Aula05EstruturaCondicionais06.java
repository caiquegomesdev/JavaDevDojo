package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        Scanner sc = new Scanner(System.in);
        byte dia = sc.nextByte();
        //char, int, byte, short, enum,String


        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Nao e dia da semana");

                sc.close();
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("HOMEM");
                break;
            case 'F': {
                System.out.println("MULHER");
                break;
            }
            default:
                System.out.println("INVALIDO!");
                break;
        }
    }
}
