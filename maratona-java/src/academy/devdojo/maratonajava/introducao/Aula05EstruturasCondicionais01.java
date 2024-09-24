package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >=18;

        if(isAutorizadoComprarBebida == false) {
            System.out.println("Pode comprar bebida alcolica");
        } else {
            System.out.println("Nao pode comprar bebida");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Nao pode comprar bebida");
        }


    }
}
