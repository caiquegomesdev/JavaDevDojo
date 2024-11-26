package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("DENTRO DO ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("DENTRO DO RuntimeException");
        }

        try {
            talvezLanceException();
        } catch ( IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException{

    }

}
