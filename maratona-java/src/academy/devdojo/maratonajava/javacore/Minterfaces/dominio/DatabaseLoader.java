package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove{
    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("CARREGANDO DADOS DO BANCO DE DADOS ...");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO DO BANCO DE DADOS");
    }

    @Override
    public void checkPermission() {
        System.out.println("CHECANDO PERMISSOES NO BANCO DE DADOS");
    }

    public  static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
