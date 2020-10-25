package sk.jaro;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringFormat {
    public static void main(String[] args) {
//        int i = 2018;
//        String meno = "jaro";
//        System.out.println("V roku " + i +" "+meno+" robil java kurz 2");
//
//        String s = String.format("%b",true);
//        System.out.printf("%b %n",false);
//        System.out.printf("%b %n",meno);
//        System.out.printf("%c %n",'j');
//        System.out.printf("%d %n",10);
//        System.out.printf("%f %n",10.15);
//        System.out.printf("a%nb %n");
//        System.out.printf("V roku %d %s robil java kurz %f %n",2017,"Jaro",2.0);

        advance();
    }

    private static void advance() {
        Calendar c = Calendar.getInstance(Locale.forLanguageTag("sk_SK"));
        String s1 = String.format("Jarove narodky: %1$td %1$tb %1$ty", c);
        String s2 = String.format("Jarove narodky: %1$Td %1$Tb %1$Ty", c); //error
        String s3 = String.format("Jarove narodky: %1$TD %1$TB %1$TY", c); //error
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

//        SYNTAX
//        %[argument_index$][flags][width][.precision]conversion
//
//        Na formátovanie času a dátumu použijeme syntax:
//        %[argument_index$][flags][width]conversion


        System.out.printf("%2$s má: %d %n","Jaro",10);

        System.out.printf("%2$10s má: %d \n",10,"Jaro");
        System.out.printf("%2$-10s má: %d \n",10,"Jaro"); //- left justified flag


        System.out.printf("%2$10.2s má: %d %n",10,"Jaro");

        //argument indexes
        System.out.printf("%s %s %s %s", "a", "b", "c", "d");
        System.out.println();
        System.out.printf("%2$s %s %<s %s", "a", "b", "c", "d"); //posledné %s by sa zdalo, že použije d, ale namiesto toho je to druhý argument bez špecifikácie poradia, tak zoberie druhý znak
        System.out.println();


        System.out.printf("%2$s %<s %<s", "a", "b");
        System.out.println();

        System.out.printf("%1$s %s %s", "Jaroslav"); //error
        System.out.printf("%1.2$s %s %s", "Jaroslav");
        System.out.printf("%1$.2s %<s ", "Jaroslav");
    }
}
