package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    //psvm + tab
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        int idade = (int) 1000000000L;
        int ageOfFather = 40;
        long numeroGrande = 10000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Caique Gomes";

        System.out.println("A idade do Pai é " + ageOfFather + " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
