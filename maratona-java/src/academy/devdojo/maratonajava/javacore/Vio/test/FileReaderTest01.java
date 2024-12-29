package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            System.out.println(fr.read());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
