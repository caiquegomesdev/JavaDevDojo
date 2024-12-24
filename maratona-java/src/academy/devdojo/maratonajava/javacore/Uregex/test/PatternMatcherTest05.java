package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que nao for incluso no \w
        // []
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = um ou mais
        // {n,m} de n ate m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";
        String texto = "Caiquegomesdev@gmail.com, 123jotaro@gmail.com, #@!zoro@gmail.com, teste@gmail.com, sukuna@mail ";
        Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(texto2);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+"\n");
        }


    }
}
