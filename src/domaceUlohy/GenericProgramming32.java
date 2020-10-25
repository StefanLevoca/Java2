package domaceUlohy;

import sk.jaro.generics.Box;

//TASK 3.2
public class GenericProgramming32 {

    private Object object;

    public void addObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {

        System.out.println("TASK 3.2");

        Box box1 = new Box();
        box1.addObject(new CD("BEATLES"));
        CD cd = (CD) box1.getObject();
        System.out.println(cd);

        Box box2 = new Box();
        box2.addObject(new Filmy("Poznavame Turecko"));
        Filmy film = (Filmy) box2.getObject();
        System.out.println(film);

        Box box3 = new Box();
        box3.addObject(new Knihy("Java 8"));
        Knihy kniha = (Knihy) box3.getObject();
        System.out.println(kniha);
    }
}
