package domaceUlohy;

public class DaysTest {
    public static void main(String[] args) {
        Days day = Days.SUNDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Dnes je konecne pondelok a mozem byt v praci :)!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Fuu, tento týždeň je parádny.");
                break;
            case FRIDAY:
                System.out.println("Konečne bude víkend a môžem ísť na Čertov hrádok.");
                break;
            default:
                System.out.println("Je víkend.");
                break;
        }
        System.out.println();
        for (Days dt : day.values()) {
            System.out.println(dt);
        }
    }
}
