package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest04 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 10;
        int b = 20;

        calculadora.alteraDoisNumeros(a, b);
        System.out.println("numero1 "+a);
        System.out.println("numero2 "+b);
    }


}
