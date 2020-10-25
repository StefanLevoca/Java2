package sk.jaro.streams;

import sk.jaro.utils.Osoba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AkoGenerovatStream {
    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                null,
                new Osoba("Jaro", "Beno", 30),
                new Osoba("Peter", "Kridlo", 55),
                new Osoba("Karol", "Otko", 18),
                new Osoba("Karol", "Beno", 18),
                new Osoba("Peter", "Otko", 20),
                new Osoba("Fedor", "Ronald", 84)
        );

        osoby.stream().mapToInt(Osoba::getVek).sum();
    }
}
