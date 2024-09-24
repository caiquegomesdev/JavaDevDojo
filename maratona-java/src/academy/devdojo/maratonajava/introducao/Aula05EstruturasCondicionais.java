package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >=18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcolica");
        }
        if(!isAutorizadoComprarBebida) {
            System.out.println("Nao pode comprar bebida");
        }
        

    }
}
