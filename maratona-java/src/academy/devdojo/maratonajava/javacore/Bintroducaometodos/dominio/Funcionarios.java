package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados(){

        System.out.println("-----------------");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        if (salarios == null){
            return;
        }
        System.out.println("SALARIO 1: " + this.salarios[0]);
        System.out.println("SALARIO 2: " +this.salarios[1]);
        System.out.println("SALARIO 3: " +this.salarios[2]);
        for (double salario: salarios){
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                media = +salario;
            }
            media /= salarios.length;

        System.out.println("\nMEDIA SALARIAL: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

