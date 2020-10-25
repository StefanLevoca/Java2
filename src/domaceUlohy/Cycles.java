package domaceUlohy;

public class Cycles {

    public static void main(String[] args) {
        System.out.println("ULOHA 1");
        int numbers = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= numbers; j++) {
                System.out.print(j);
            }
            System.out.println();
            numbers--;
        }
        System.out.println();
        System.out.println("ULOHA 2");
        numbers = 1;
        int i = 1;
        while (i <= 4) {
            for (int j = 1; j <= numbers; j++) {
                System.out.print(j);
            }
            System.out.println();
            numbers++;
            i++;
        }
        System.out.println();
        System.out.println("ULOHA 3");
           i = 1;
        while (i <= 4) {
            for (int j = 1; j <= 4; j++) {
                if (j == i) {
                    System.out.print("_");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
            i++;
        }
    }
}
