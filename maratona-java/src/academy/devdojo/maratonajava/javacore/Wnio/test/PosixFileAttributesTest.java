package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;import java.nio.file.attribute.PosixFileAttributes;

public class PosixFileAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Users/Administrator/Documents/dev/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());
    }
}
