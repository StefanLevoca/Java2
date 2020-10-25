package sk.jaro.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples5 {

    public static void main(String[] args) {
        //1.	vytvor si zoznam miest
        List<String> mesta = Arrays.asList("Banská Bystrica", "Prešov", "Levice", "Banská Štiavnica", "Liptovský Trnovec");

        //2.	zotried zoznam
        Collections.sort(mesta,(o1, o2)->o1.compareTo(o2));

        //3.	napis metodu, ktro vypise vsetko zo zoznamu miest
        printWithFilter(mesta, s -> true);


        System.out.println("-----------");
        //4.	urob si metodu, ktora vypíse len tie mestá, ktoré sa skladajú z jedného slova
        printWithFilter(mesta, s4fsf -> !s4fsf.contains(" "));

        System.out.println("-----------");
        printWithFilter(mesta, s -> s.startsWith("B"));
    }

    private static void printWithFilter(List<String> mesta, LambdaExamples4.Filter filter) {
        for(String mesto : mesta){
            if (filter.odFiltruj(mesto)){
                System.out.println(mesto);
            }
        }
    }

    private static void printMesta(List<String> mesta) {
        for (String mesto : mesta){
            System.out.println(mesto);
        }
    }

    interface Filter{
        boolean odFiltruj(String s);
    }
}
