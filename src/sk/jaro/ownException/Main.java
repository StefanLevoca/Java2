package sk.jaro.ownException;

import sk.jaro.utils.Osoba;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        sk.jaro.utils.Osoba dospelaOsoba = new sk.jaro.utils.Osoba("Jar", "Beno", 22);

        Osoba dospelaOsoba2 = new Osoba("Jar", "Beno", 22);

        if(dospelaOsoba.getVek() < 18){
            throw new InvalidAgeException("osoba nie je dospela");
        }else{
            System.out.println("osoba je dospela");
        }

        if(dospelaOsoba.getMeno().length() > 3){
            throw new NameTooLongException("Meno je priliz dlhe");
        }else{
            System.out.println("meno je ok");
        }

    }
}