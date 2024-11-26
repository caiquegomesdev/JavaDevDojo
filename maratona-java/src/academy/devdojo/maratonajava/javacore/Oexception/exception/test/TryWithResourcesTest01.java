package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static  void lerArquivo(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (reader != null){
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }
}
