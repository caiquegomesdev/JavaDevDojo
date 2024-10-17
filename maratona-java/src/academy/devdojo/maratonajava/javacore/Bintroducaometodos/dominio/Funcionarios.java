package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados(){

        System.out.println("-----------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        System.out.println("SALARIO 1: " + this.salarios[0]);
        System.out.println("SALARIO 2: " +this.salarios[1]);
        System.out.println("SALARIO 3: " +this.salarios[2]);
        for (double salario: salarios){
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        double media = 0;
        for (double salario: salarios){
            media =+ salario;
        }
        media /= salarios.length;
        System.out.println("\nMEDIA SALARIAL: " + media);
    }
}
