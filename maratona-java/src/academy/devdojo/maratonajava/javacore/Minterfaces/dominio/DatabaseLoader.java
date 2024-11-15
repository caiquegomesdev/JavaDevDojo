package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("CARREGANDO DADOS DO BANCO DE DADOS ...");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO DO BANCO DE DADOS");
    }
}
