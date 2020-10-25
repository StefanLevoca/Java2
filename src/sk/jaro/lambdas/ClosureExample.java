package sk.jaro.lambdas;

import sk.jaro.utils.Osoba;

public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Osoba osoba = new Osoba("Jaro", "Beno", 30);

        addToIt(a, i -> System.out.println(i+b));

        addToIt(a, i -> {
//            osoba=new Osoba("peter","sveter",10);
            osoba.setVek(100);
            System.out.println(i+osoba.getVek());
        });

    }

    static void addToIt(int i, Process process){
        process.process(i);
    }


    interface Process {
        void process(int i);
    }

}
