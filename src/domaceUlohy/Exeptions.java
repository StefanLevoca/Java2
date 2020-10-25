package domaceUlohy;

public class Exeptions {

    public static void main(String[] args) {
        try {
            setAge(26);
        } catch (WrongAgeException e) {
            e.printStackTrace();
        }
        setHeight(177);
    }

    public static void setAge(int number) throws WrongAgeException {
        if(number < 0)
            throw new WrongAgeException("Vek je zaporny");
        else
            System.out.println("Vek je " + number);
    }

    public static void setHeight(double height) {
        if (height <= 0|| height > 272)
            throw new WrongHeightException("Cislo je mimo stanoveny interval");
        else
            System.out.println("Vyska je " + height);
    }
}
