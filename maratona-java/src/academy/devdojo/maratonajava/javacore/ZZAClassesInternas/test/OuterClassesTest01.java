package academy.devdojo.maratonajava.javacore.ZZAClassesInternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner1 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner1.printOuterClassAttribute();
    }
}
