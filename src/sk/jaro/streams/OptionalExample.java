package sk.jaro.streams;

import sk.jaro.utils.Osoba;
import sk.jaro.utils.OsobaOptional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
//        basicOptional();

//        moreOptional();

//        orElseOptional();

        realLife();
    }

    private static void realLife() {
        OsobaOptional o = new OsobaOptional("Jaro", null, 30);
        o.getPriezvisko().ifPresent(pr -> System.out.println(pr.toUpperCase()));

    }

    private static void orElseOptional() {
        Optional<String> meno = Optional.of("Jaro");
        Optional<String> prazdne = Optional.empty();

        System.out.println(meno.orElse("nic"));
        System.out.println(prazdne.orElse("nic"));

        System.out.println(meno.orElseGet(()-> "nič"));
        System.out.println(prazdne.orElseGet(()-> "nič"));
    }

    private static void moreOptional() {
        Optional<String> meno = Optional.of("Jaro");
        Optional<String> prazdne = Optional.empty();


        if(meno.isPresent()){
            System.out.println("meno: "+meno.get());
        }else{
            System.out.println("meno tam nieje ");
        }

        meno.ifPresent(m -> System.out.println("meno je: "+m));
        prazdne.ifPresent(m -> System.out.println("meno je: "+m));


    }

    private static void basicOptional() {
        Optional<String> meno = Optional.of("Jaro");
        String hodnota1 = "daco";
        String hodnota2 = null;

        System.out.println("neprazdnom Optional:" + meno);
        System.out.println("neprazdnom Optional: meno: " + meno.get());
        System.out.println("prazdny Optional: " + Optional.empty());
//
        System.out.println("ofNullable na neprazdnom Optional: " + Optional.ofNullable(hodnota1));
        System.out.println("ofNullable na prazdnom Optional: " + Optional.ofNullable(hodnota2));

        // java.lang.NullPointerException
        System.out.println("ofNullable na neprazdnom Optional: " + Optional.of(hodnota2));
    }
}
