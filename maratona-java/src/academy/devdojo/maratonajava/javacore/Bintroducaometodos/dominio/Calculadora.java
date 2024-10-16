package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class Calculadora {

    public void somaDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int soma = sc.nextInt();
        int soma2 = sc.nextInt();
        System.out.println("Soma: ");
        System.out.println(soma + soma2);
        System.out.println("----------------------");

    }

    public void subtraiDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int subtracao = sc.nextInt();
        int subtracao2 = sc.nextInt();

        System.out.println("Subtracao: ");
        System.out.println(subtracao - subtracao2);
        System.out.println("----------------------");

    }

    public void multiplicaDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int multiplica = sc.nextInt();
        int multiplica2 = sc.nextInt();

        System.out.println("Multiplicacao: ");
        System.out.println(multiplica * multiplica2);
        System.out.println("----------------------");

    }

    public void divideDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int divide = sc.nextInt();
        int divide2 = sc.nextInt();

        System.out.println("Divisao: ");
        System.out.println(divide / divide2);
        System.out.println("----------------------");
        sc.close();
    }

    public double divideDoisValores(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void divideDoisValores02(double num1, double num2){
        if (num2 == 0){
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1/num2);;
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " +numero1);
        System.out.println("Num2 "+ numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
