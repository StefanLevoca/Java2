package sk.jaro.generics;

import sk.jaro.objects.NejakyPesSerialized;
import sk.jaro.objects.Pes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inference {
    static <T> T pick(T a1, T a2) { return a1; }

    public static void main(String[] args) {
        Object o = pick("d", new ArrayList<String>());

        HashMap<String, List<String>> myMap = new HashMap<String, List<String>>();
        HashMap<String, List<String>> myMap2 = new HashMap<>();

    }
}
