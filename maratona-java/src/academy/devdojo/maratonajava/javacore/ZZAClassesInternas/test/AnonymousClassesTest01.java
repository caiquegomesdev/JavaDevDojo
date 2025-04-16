package academy.devdojo.maratonajava.javacore.ZZAClassesInternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

class Cachorro extends Animal{
    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {

    }
}
