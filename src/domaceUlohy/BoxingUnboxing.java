package domaceUlohy;

public class BoxingUnboxing {

    // 1. metóda – vstup: int – výstup: Integer
    private static Integer intToInteger(int i) {
        System.out.println("1. metoda");
        System.out.println("Pred " + i);
        i++;
        System.out.println("Po " + i);
        return i;
    }

    // 2. metóda – vstup: double – výstup: Double
    private static Double doubleToDouble(double d) {
        System.out.println("2. metoda");
        System.out.println("Pred " + d);
        d++;
        System.out.println("Po " + d);
        return d;
    }

    //3. metóda – vstup: long – výstup: Long
    private static Long longToLong(long l) {
        System.out.println("3. metoda");
        System.out.println("Pred " + l);
        l++;
        System.out.println("Po " + l);
        return l;
    }

    // 4. metóda – vstup: Integer – výstup: int
    private static int intToInt(Integer i) {
        System.out.println("4. metoda");
        System.out.println("Pred " + i);
        i++;
        System.out.println("Po " + i);
        return i;
    }

    // 5. metóda – vstup: Double – výstup: double
    private static double doubleToDouble(Double d) {
        System.out.println("5. metoda");
        System.out.println("Pred " + d);
        d++;
        System.out.println("Po " + d);
        return d;
    }

    // 6. metóda – vstup: Long – výstup: long
    private static long longToLong(Long l) {
        System.out.println("6. metoda");
        System.out.println("Pred " + l);
        l++;
        System.out.println("Po " + l);
        return l;
    }

    // spúšťacia metóda
    public static void main(String[] args) {
        final int CISLO1 = 1;
        final double CISLO2 = 3;
        final long CISLO3 = 5;
        Integer objekt1 = Integer.valueOf(7);
        Double objekt2 = Double.valueOf(9);
        Long objekt3 = Long.valueOf(11);

        intToInteger(CISLO1);
        System.out.println();
        doubleToDouble(CISLO2);
        System.out.println();
        longToLong(CISLO3);
        System.out.println();
        intToInt(objekt1);
        System.out.println();
        doubleToDouble(objekt2);
        System.out.println();
        longToLong(objekt3);
        System.out.println();
    }
}
