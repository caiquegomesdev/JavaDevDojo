package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 Categoria Infantil
        //idade >= 15 && idade < 18 Categoria Juvenil
        //idade >= 18 Categoria Adulto

        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if(idade < 15){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulta");
        }

        sc.close();
    }
}
