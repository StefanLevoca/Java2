package sk.jaro.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Unbounded {
    public static void main(String[] args) {

    }

    private static void printMap(HashMap<Long,?> collection) {
        for(Long key : collection.keySet()){
            System.out.println((collection.get(key)));
        }
    }

    private static <P> void printMap2(HashMap<Long,P> collection) {
       for(Long key : collection.keySet()){
            P value = collection.get(key);
            collection.put(10L,value);
            System.out.println((collection.get(key)));
        }
    }
}
