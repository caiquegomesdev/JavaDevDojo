package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        int count = 12;
                while (count < 10) {
                    System.out.println(++count);
                }
                count = 0;
                do {
                    System.out.println("Dentro do do-while " + ++count);
                } while (count<10);
                count = 0;
                for(int i = 0; i < 10; i++){
                    System.out.println("For " + i);
                }
    }
}
