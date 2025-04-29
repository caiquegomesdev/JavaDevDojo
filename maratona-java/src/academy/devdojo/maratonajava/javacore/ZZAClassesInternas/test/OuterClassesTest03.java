package academy.devdojo.maratonajava.javacore.ZZAClassesInternas.test;


public class OuterClassesTest03 {
    private String name = "Gomes";
    static class Nested{
        private String lastName = "Caique";
        void print(){
            System.out.println(new OuterClassesTest03().name+" "+ lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
