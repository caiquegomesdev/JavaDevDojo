package academy.devdojo.maratonajava.javacore.ZZAClassesInternas.test;

public class OuterClassesTest02 {
    private String nome = "Midoriya";

    void print(){
        String lastName = "Izuku";
        
        class LocalClass{
            public  void printLocal(){
                System.out.println(nome + " " +lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }

}
