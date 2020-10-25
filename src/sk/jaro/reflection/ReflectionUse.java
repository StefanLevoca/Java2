package sk.jaro.reflection;

import sk.jaro.utils.Osoba;

public class ReflectionUse {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = "Jaro".getClass();

        Osoba o = new Osoba("jaro","beno",10);
        clazz = o.getClass();

        clazz = Osoba.class;
        clazz = String.class;

        clazz = Class.forName("sk.jaro.utils.Osoba");
    }
}
