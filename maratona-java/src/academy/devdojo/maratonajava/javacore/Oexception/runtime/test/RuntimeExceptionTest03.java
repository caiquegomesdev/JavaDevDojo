package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo Arquivo");
            throw new RuntimeException();
            // System.out.println("Escrevendo dados no Arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recuso liberado pelo SO");
        }
        return null;
    }
}
