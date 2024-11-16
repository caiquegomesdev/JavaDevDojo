package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader,DataRemove {
    @Override
    public void load() {
        System.out.println("CARREGANDO DADOS DE UM ARQUIVO...");
    }

    @Override
    public void remove() {
        System.out.println("DELETANDO DADOS DE UM ARQUIVO");
    }

    @Override
    public void checkPermission() {
        System.out.println("CHECANDO PERMISSOES NO ARQUIVO");
    }


}
