package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("maratona-java");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
