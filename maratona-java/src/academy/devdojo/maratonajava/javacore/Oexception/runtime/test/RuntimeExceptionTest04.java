package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("DENTRO DO ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("DENTRO DO IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("DENTRO DO IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("DENTRO DO ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("DENTRO DO RuntimeException");
        }

    }

}
