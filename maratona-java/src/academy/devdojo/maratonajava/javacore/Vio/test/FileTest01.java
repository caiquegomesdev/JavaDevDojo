package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        try {
            boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
