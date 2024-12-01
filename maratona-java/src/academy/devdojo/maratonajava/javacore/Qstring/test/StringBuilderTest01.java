package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Caique Gomes";
        nome.concat("Software Developer");

        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Caique Gomes");
        sb.append(" Software Developer").append(" Academy");

        System.out.println(sb);
    }
}
