package sk.jaro.streams;

import sk.jaro.utils.Osoba;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

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

//        List<Integer> veky = osoby.stream()
//                .filter(osoba -> osoba.getVek() < 50)
//                .sorted(Comparator.comparing(Osoba::getVek))
//                .map(Osoba::getVek)
//                .collect(Collectors.toList());
//
//        veky.forEach(System.out::println);


        osoby.stream().map(Optional::ofNullable).findFirst().ifPresent(System.out::println);

    }
}
