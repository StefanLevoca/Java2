package sk.jaro.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples4 {

//1.	vytvor si zoznam miest
//2.	zotried zoznam
//3.	napis metodu, ktro vypise vsetko zo zoznamu miest
//4.	urob si metodu, ktora vypíse len tie mestá, ktoré sa skladajú z jedného slova
//5.	nepouzivaj pri tom lambda vyrazy


    public static void main(String[] args) {
        //1.	vytvor si zoznam miest
        List<String> mesta = Arrays.asList("Banská Bystrica", "Prešov", "Levice", "Banská Štiavnica", "Liptovský Trnovec");

        //2.	zotried zoznam
        Collections.sort(mesta, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //3.	napis metodu, ktro vypise vsetko zo zoznamu miest
        printMesta(mesta);


        System.out.println("-----------");
        //4.	urob si metodu, ktora vypíse len tie mestá, ktoré sa skladajú z jedného slova
        printWithFilter(mesta, new Filter() {
            @Override
            public boolean odFiltruj(String s) {
                return !s.contains(" ");
            }
        });

        System.out.println("-----------");
        printWithFilter(mesta, new Filter() {
            @Override
            public boolean odFiltruj(String s) {
                return s.startsWith("B");
            }
        });
    }

    private static void printWithFilter(List<String> mesta, Filter filter) {
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
