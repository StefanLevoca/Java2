package sk.jaro;

public class Numbers {
    public static void main(String[] args) {
//        basic();
//        modulo();
//        basicMathOperations();
        randomNumbers();
    }

    private static void basic(){
        Byte b = 127;
//        Byte b2 = 128; //error
        int ji = b.intValue();
        System.out.println(ji);
//
        String decimal = "2.5";
        double d1 = Double.parseDouble(decimal);
//        System.out.println(d);
//
        decimal = "2.5a";
        double d;
        d = Double.parseDouble(decimal); //pouzitie try catch alebo kniznic Apache Commons Lang - StringUtils.isNumeric

        System.out.println(d1);
    }

    // +, -, *, /, %
    private static void modulo() {
        for(int i = 0; i < 32; i++){
            rozdajHracoviKartu(i%4,i);
        }
    }

    private static void rozdajHracoviKartu(int hrac, int karta) {
        System.out.println("rozdavam hracovi "+hrac+", kartu cislo "+karta);
    }

    private static void basicMathOperations() {
        //dalsie matematicke operacie a pomocky java.lang.Math
        System.out.println(Math.PI);


        double a = -191.635;
        double b = 43.24;
        int c = 16, d = 45;


        System.out.println("a "+a+" abs "+ Math.abs(a));

        System.out.println("b "+b+" ceil "+Math.ceil(b));

        System.out.println("b "+b+" floor "+Math.floor(b));

        System.out.println("b "+b+" rint "+Math.rint(b)); //klasicke zaokruhovanie zmen b ... vracia double hodnotu intu
        System.out.println("b "+b+" round "+Math.round(b)); //klasicke zaokruhovanie zmen b ... vracia int alebo long ... int round(float f)

        System.out.println("c "+c+" a d "+d+" max "+Math.max(c, d));

        System.out.println("c "+c+" a d "+d+" min "+Math.min(c, d));
    }

    private static void randomNumbers() {
        int number = (int)(Math.random() * 100);  //Math.random() hodnota od 0.0 po 1.0  ... kratenim vies zvatsit .. pretypovanie na int
        System.out.println(number);
    }
}
