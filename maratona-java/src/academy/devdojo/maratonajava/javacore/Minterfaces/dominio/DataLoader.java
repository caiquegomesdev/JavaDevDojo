package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static  final  int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission(){
        System.out.println("FAZENDO CHECAGEM DE PERMISSOES");
    };

    public  static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
