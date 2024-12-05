package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndia = new Locale("hi","IN");
        Locale localeJapao = new Locale("ja","JP");
        Locale localeHolanda = new Locale("nl","NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);

        System.out.println("Italia " + df1.format(calendar.getTime()));
        System.out.println("Suiça " + df2.format(calendar.getTime()));
    }


}
