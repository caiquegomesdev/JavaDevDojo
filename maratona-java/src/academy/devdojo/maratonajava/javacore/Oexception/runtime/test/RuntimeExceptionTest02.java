package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        divisao(1,0);

        System.out.println("Codigo Finalizado.");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;

    }
}
