package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Luffy  ";
        String numeros = "0123456";
        String sobrenome = "Monkey D.";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "c"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,numeros.length()));
        System.out.println(numeros.substring(numeros.length()));
        System.out.println(nome.trim());
        System.out.println(sobrenome.toLowerCase());
        System.out.println(sobrenome);
    }
}
