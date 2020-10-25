package sk.jaro.generics;

import java.util.List;

public class Think {
    public static <P extends Number> double sumOfList(List<P> list) {
        double s = 0.0;
        for (P elem : list) {
            s += elem.doubleValue();
        }

        P element = list.get(1);
        list.add(1,element);
        return s;
    }

    public static double sumOfList2(List<? extends Number> list) {
        double s = 0.0;
        for (Number elem : list) {
            s += elem.doubleValue();
        }
//        list.add(1,list.get(1));
        return s;
    }
}
