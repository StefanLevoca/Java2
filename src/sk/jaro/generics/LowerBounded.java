package sk.jaro.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addInteger(list);
        addInteger(list);
        addInteger(list);
    }

    public static void addInteger(List<? super Integer> list) {
        int  i = (int) (Math.random()*10);
        System.out.println(i);
        list.add(i);
        System.out.println(list.get(0));
    }
}
