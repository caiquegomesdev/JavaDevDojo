package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosFileAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");
        if(Files.notExists(path)) Files.createFile(path);
        Files.createFile(path);
        Files.setAttribute(path,"dos:hidden", true);
        Files.setAttribute(path,"dos:readonly",true);
        Files.setAttribute(path,"dos:hidden",false);
        Files.setAttribute(path,"dos:readonly",false);
    }
}
