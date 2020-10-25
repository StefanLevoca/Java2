package sk.jaro;

public class BoxingUnboxing {
    public static void main(String[] args) {

        Integer i = 10;
        int j = new Integer(10);
        int k = i;

        Boolean b1 = true;
        boolean b2 = b1;


        //values
        System.out.println("\nMetody tried");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.max(10,20));


        //Konverzia čísla na String
        System.out.println("\nKonverzia čísla na String");
        String s = String.valueOf(i);
        System.out.println(s);

        double d = 7.6;
        String string = String.valueOf(d);
        System.out.println(string);

        //Konverzia String na číslo
        System.out.println("\nKonverzia String na číslo");
        String s2 = "7";
        int m = Integer.parseInt(s2);
        System.out.println(m);

        String s3 = "7.6";
        double d2 = Double.parseDouble(s3);
        System.out.println(d2);

        //chyba !!!
        String s4 = "7.6s";
        double d3 = Double.parseDouble(s4); //error
        System.out.println(d3);
    }

    private static void daco(Object c){
        c.toString();
    }
}
