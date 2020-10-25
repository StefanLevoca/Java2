package sk.jaro.vnutorne.nevnorenePriklad;

public class Hra {
    public void zacniHru(){
        System.out.println("zacala hra");

        Hrac h = new Hrac(10);
        h.upravSkoreHraca(10);
    }
}
