package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;

public class CalculadoraImposto {
    public  void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de Imposto do computador");
        double imposto = computador.calcularImposto();
        
    }
}
