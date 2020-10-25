package sk.jaro.collections;

import java.util.*;

public class Sets {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        String s = "e";
        set1.add("element1");
        set1.add("element2");
        set1.add("element3");
        set1.add("element4");
        set1.add(s);

//        System.out.println(set1.contains("e"));
////        set1.remove(s);
//        Iterator i = set1.iterator();
//        while (i.hasNext()){
////            String s1 = (String) i.next();
//            System.out.println(i.next());
//        }

        Set<String> set2 = new HashSet<>();
        set2.add("element3");
        set2.add("element4");
        set2.add("element5");
        set2.add("element6");

//        System.out.println("containsAll");
//        System.out.println(set1.containsAll(set2)); // spýtam sa či všetky elementy zo set1 sú aj v set2
//        System.out.println("-----------------------");

//        set1.removeAll(set2);  //odstránim z set1 všetky zhodné elementy so set2
//        System.out.println("removeAll");
//        printSet(set1);
//        printSet(set2);
//        System.out.println("-----------------------");

//        set1.addAll(set2); //vsetko zo set2 pridam do set1
//        System.out.println("addAll");
//        printSet(set1);
//        printSet(set2);
//        System.out.println("-----------------------");

        set1.retainAll(set2); //vytvorim v set1 taky set, ktory bude obsahovat len elementy, ktore existuju v oboch setoch
        System.out.println("retainAll");
        printSet(set1);
        printSet(set2);
        System.out.println("-----------------------");
    }

    private static void printSet(Set<String> set) {
        System.out.println("set:");
        for(String s : set) {
            System.out.println(s);
        }
    }
}
