package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que nao for digito
        // \s = Espacos em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que nao for incluso no \w
        // []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(texto2);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+"\n");
        }


    }
}
