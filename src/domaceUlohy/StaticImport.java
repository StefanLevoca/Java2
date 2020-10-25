package domaceUlohy;

import static java.lang.Math.*;

public class StaticImport {

    private static double MathCeil(double number) {
        return ceil(number);
    }

    public static void main(String[] args) {
        final double NUMBER = 16_664.45789;
        System.out.println("Cislo " + NUMBER +
                " po zaokruhleni smerom nahor nadobuda hodnotu " + MathCeil(NUMBER));
    }
}
