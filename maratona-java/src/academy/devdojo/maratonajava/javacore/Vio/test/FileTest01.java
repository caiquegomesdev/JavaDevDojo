package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args){
        File file = new File("file.txt");
        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Created " +isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is file " + file.isFile());

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
