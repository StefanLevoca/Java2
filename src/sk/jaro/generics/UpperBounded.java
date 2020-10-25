package sk.jaro.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBounded {
    public static void main(String[] args) {
        sumOfList(Arrays.asList(10,20,30));
        sumOfList2(Arrays.asList(10,20,30));

    }

    public static <P extends Number> double sumOfList(List<P> list) {
        double s = 0.0;
        for (P elem : list) {
            s += elem.doubleValue();
        }
        P i = list.get(1);
        list.add(i);
        return s;
    }

    public static double sumOfList2(List<? extends Number> list) {
        double s = 0.0;
        for (Number elem : list) {
            s += elem.doubleValue();
        }
        return s;
    }
}
