package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Gomes"; // String constant pool
        String nome2 = "Gomes";
        nome = nome.concat( " Caique");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Gomes");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }

}
