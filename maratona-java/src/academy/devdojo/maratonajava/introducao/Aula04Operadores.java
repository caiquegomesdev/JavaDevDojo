package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double result = numero01 / (double) numero02;
        System.out.println(result);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // <  >  <=  >=  ==  !=
        boolean isDezMaiorQuevinte = 10 > 20;
        boolean isDezMenorQuevinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 == 20;

        System.out.println("isDezMaiorQuevinte = " + isDezMaiorQuevinte);
        System.out.println("isDezMenorQuevinte = " + isDezMenorQuevinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);
        System.out.println("isDezIgualDez = " + isDezIgualDez);
        System.out.println("isDezDiferenteVinte = " + isDezDiferenteVinte);

        // && (AND)   || (or)  !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta   " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 2000; //bonus = bonus + 2000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);

    }
}
