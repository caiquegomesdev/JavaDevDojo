package academy.devdojo.maratonajava.javacore.Zgenerics.test;



public class WildcardTest02 {
    public static void main(String[] args) {
       
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
}
