package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;


public class CalculadoraTestAll {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros();
        calculadora.divideDoisNumeros();
        calculadora.divideDoisValores02(86,0);

        double result = calculadora.divideDoisValores(20,0);
        System.out.println(result);


        System.out.println("Finalizando CalculadoraTest01");
    }

}
