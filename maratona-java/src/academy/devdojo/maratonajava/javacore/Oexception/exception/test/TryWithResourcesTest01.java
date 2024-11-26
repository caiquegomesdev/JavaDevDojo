package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        } catch (IOException e){

        }
    }
    public static  void lerArquivo2(){
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
