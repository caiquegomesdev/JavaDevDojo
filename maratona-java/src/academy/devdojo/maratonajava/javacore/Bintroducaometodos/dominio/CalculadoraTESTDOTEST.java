package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class CalculadoraTESTDOTEST {

    public void somaDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int soma = sc.nextInt();
        int soma2 = sc.nextInt();
        System.out.println("Soma: ");
        System.out.println(soma + soma2);


    }

    public void subtraiDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int subtracao = sc.nextInt();
        int subtracao2 = sc.nextInt();

        System.out.println("Subtracao: ");
        System.out.println(subtracao - subtracao2);

    }

    public void multiplicaDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int multiplica = sc.nextInt();
        int multiplica2 = sc.nextInt();

        System.out.println("Multiplicacao: ");
        System.out.println(multiplica * multiplica2);

    }

    public void divideDoisNumeros(){
        Scanner sc = new Scanner(System.in);
        int divide = sc.nextInt();
        int divide2 = sc.nextInt();

        System.out.println("Divisao: ");
        System.out.println(divide / divide2);
        sc.close();
    }



}
