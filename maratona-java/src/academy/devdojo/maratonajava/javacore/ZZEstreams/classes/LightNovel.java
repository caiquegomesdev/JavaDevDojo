package academy.devdojo.maratonajava.javacore.ZZEstreams.classes;

public class LightNovel {
    private String tilte;
    private double price;

    public LightNovel(String tilte, double price) {
        this.tilte = tilte;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "tilte='" + tilte + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTilte() {
        return tilte;
    }

    public double getPrice() {
        return price;
    }
}
