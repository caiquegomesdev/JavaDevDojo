package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringperformaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " +(inicio - fim) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " +(inicio - fim) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " +(inicio - fim) + "ms");
    }
    
    private static void concatString(int tamanho){
        String texto = " Ola meu nome é Gomes. ";
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

    private static void concatStringBuffer(int tamanho){
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);

        }
    }
}
