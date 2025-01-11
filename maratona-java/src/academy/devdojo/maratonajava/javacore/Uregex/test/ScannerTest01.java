package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Okarun, Eren, Gon, Gojo";
        String[] nomes = texto.split("\\d");
        for(String nome : nomes) {
            System.out.println(nome.trim());
        }
    }

}
