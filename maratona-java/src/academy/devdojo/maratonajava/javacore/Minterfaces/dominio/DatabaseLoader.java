package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("CARREGANDO DADOS DO BANCO DE DADOS ...");
    }

}
