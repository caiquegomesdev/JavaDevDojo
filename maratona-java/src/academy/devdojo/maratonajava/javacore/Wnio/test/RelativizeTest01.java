package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\Administrator\\Documents\\JavaDevDojo-main\\maratona-java\\src");
        Path clazz = Paths.get("C:\\Users\\Administrator\\Documents\\JavaDevDojo-main\\maratona-java\\src");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto = Paths.get("/home/gomes");
        Path absoluto2 = Paths.get("/usr/local");

        System.out.println("1 " + absoluto.relativize(absoluto2) );
    }
}
