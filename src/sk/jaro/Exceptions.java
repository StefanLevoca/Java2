package sk.jaro;

import sk.jaro.utils.Osoba;

public class Exceptions {

    public static double delenie(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("e1 Argument 'y' je 0");
        }
        return x / y;
    }

    public static double delenie2(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("e2 Argument 'y' je 0");
        }
        return x / y;
    }

    public static void nullPointer() {
        Osoba o = new Osoba("jaro", "beno", 29);


        o.setMeno(null);

        System.out.println(o
                .getMeno()
                .toLowerCase());

    }



    public static void main(String[] args) {
        try {
            delenie(10.0,0.0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);

        }
//        delenie2(10.0,0.0);

        nullPointer();
    }
}
