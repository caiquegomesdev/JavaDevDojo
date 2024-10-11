package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.ExecicioOrientacaoObjetosClasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.ExecicioOrientacaoObjetosClasses.Objetos.Aviao;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.ExecicioOrientacaoObjetosClasses.Objetos.Carro;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.ExecicioOrientacaoObjetosClasses.Objetos.Carro1;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.ExecicioOrientacaoObjetosClasses.Objetos.Moto;

public class Test {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.Nome = "Honda";
        carro.Modelo = "Civic";
        carro.ano = 2024;

        System.out.println("Nome: " + carro.Nome +" Modelo: "+ carro.Modelo +" Ano: "+ carro.ano);

        System.out.println("---------------------------------");

        Carro1 carro1 = new Carro1();
        carro1.Nome = "Fusca Bala";
        carro1.Modelo = "Sport";
        carro1.ano = 1968;

        System.out.println("Nome: " + carro1.Nome +" Modelo: "+ carro1.Modelo +" Ano: "+ carro1.ano);



        System.out.println("---------------------------------");

        Moto moto = new Moto();
        moto.Nome = "Yamaha";
        moto.Modelo = "Mt-03";
        moto.ano = 2025;

        System.out.println("Nome: " + moto.Nome +" Modelo: "+ moto.Modelo +" Ano: "+ moto.ano);

        System.out.println("---------------------------------");

        Aviao aviao = new Aviao();
        aviao.Nome = "Super Tucano";
        aviao.Modelo = "EMB-314";
        aviao.ano = 1999;

        System.out.println("Nome: "+ aviao.Nome +" Modelo: "+ aviao.Modelo +" Ano: "+ aviao.ano);


    }
}
