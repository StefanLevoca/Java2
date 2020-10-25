package sk.jaro.collections;

import sk.jaro.utils.Osoba;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

    private static final Comparator<Osoba> VEK_TRIEDENIE = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return Integer.compare(o1.getVek(), o2.getVek());
        }
    };

    public static void main(String[] args) {
        Osoba[] osobyArray = {
                new Osoba("Jaro", "Beno", 20),
                new Osoba("Peter", "Beno", 25),
                new Osoba("Karol", "Slepec", 18),
                new Osoba("Tomas", "Vlak", 22)
        };

        List<Osoba> osoby = Arrays.asList(osobyArray);
        System.out.println(osoby);

        Collections.sort(osoby);
        System.out.println(osoby);

        Collections.sort(osoby, VEK_TRIEDENIE);
        System.out.println(osoby);
    }
}
