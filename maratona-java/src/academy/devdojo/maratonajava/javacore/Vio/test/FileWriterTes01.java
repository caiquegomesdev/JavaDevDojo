package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader


public class FileWriterTes01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Caique Gomes é o melhor dev do Brasil\n continuando...");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
