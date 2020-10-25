package sk.jaro.generics;

import java.util.ArrayList;
import java.util.List;

public class RawType {
    public static void main(String[] args) {
        GenericBox<String> stringBox; //normálne zadefinovaý generický box
        GenericBox rawBox; //raw box

        List names = new ArrayList();
        names.add("John");
        names.add("Mary");
        names.add(Boolean.FALSE);


        for (Object o : names) {
            String name = (String) o;
            System.out.println(name);
        }
    }
}
