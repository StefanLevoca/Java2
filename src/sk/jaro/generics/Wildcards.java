package sk.jaro.generics;

import java.util.List;

public class Wildcards {

    //upper bounded  get
    public static double sumOfList2(List<? extends Number> list) {
        double s = 0.0;
        for (Number elem : list) {
            s += elem.doubleValue();
        }
        return s;
    }

    //lower bounded  put
    public static void addInteger(List<? super Integer> list) {
        int  i = (int) (Math.random()*10);
        list.add(i);
    }
}
