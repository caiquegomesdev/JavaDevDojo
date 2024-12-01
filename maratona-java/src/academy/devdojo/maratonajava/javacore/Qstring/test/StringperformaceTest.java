package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringperformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " +(inicio - fim) + "ms");
    }
    
    private static void concatString(int tamanho){
        String texto = " ";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
            
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }
}
