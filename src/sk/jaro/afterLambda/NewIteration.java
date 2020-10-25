package sk.jaro.afterLambda;

import sk.jaro.utils.Osoba;

import java.util.Arrays;
import java.util.List;

public class NewIteration {

    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Jaro", "Beno", 30),
                new Osoba("Peter", "Kridlo", 55),
                new Osoba("Karol", "Otko", 18),
                new Osoba("Fedor", "Ronald", 84)
        );

        for(int i = 0; i<osoby.size(); i++){  //osoba dorobit toString
            System.out.println(osoby.get(i).getMeno());
        }

        for(Osoba osoba : osoby){
            System.out.println(osoba.getMeno());
        }

        osoby.forEach(os -> System.out.println(os.getMeno()));

        osoby.forEach(System.out::println);
    }

}
