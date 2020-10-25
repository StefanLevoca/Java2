package domaceUlohy;

public class Numbers {
    public static void multiplication(Number number) {
        if (number instanceof Integer) {
            System.out.println(number);
            int value = (int) number * 10;
            System.out.println("Po nasobeni: " + value);
        } else if (number instanceof Double) {
            System.out.println(number);
            double value = (double) number * 10;
            System.out.println("Po nasobeni: " + value);
        } else {
            System.out.println(number);
            System.out.println("Neplatny datovy typ");
        }
    }

    public static void main(String[] args) {
        multiplication(Long.MAX_VALUE);
        System.out.println();
        multiplication(10);
        System.out.println();
        multiplication(20.0);
        System.out.println();

    }
}
