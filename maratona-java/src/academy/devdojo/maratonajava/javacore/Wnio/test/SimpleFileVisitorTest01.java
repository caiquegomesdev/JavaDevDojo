package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        return super.visitFile(file, attrs);
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) {
        Paths.get(".");
        Files.walkFileTree(root, );

    }
}
