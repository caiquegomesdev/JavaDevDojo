package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        String mensagemDoar = "Vou Doar 500 reais";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas terei!";
        //(condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

        sc.close();
    }
}
