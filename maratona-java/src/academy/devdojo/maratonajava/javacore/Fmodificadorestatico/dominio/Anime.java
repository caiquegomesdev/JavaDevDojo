package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicializacao é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 - Bloco de inicializacao e executado
    // 4 - Construtor é executado

    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZACAO 1 ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZACAO 2 ");
    }
    static {
        System.out.println("DENTRO DO BLOCO DE INICIALIZACAO 3 ");
    }

    {
        System.out.println("DENTRO DO BLOCO DE INICIALIZACAO NAO ESTATICO");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
