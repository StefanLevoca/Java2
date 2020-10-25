package domaceUlohy;

//TASK 3.1
public class GenericProgramming31<P> {
    private P object;

    public void addObject(P object) {
        this.object = object;
    }

    public P getObject() {
        return object;
    }

    public static void main(String[] args) {

        System.out.println("TASK3.1");

        GenericProgramming31<CD> genericProgramming1 = new GenericProgramming31<>();
        genericProgramming1.addObject(new CD("BEATLES"));
        System.out.println(genericProgramming1.getObject());

        GenericProgramming31<Filmy> genericProgramming2 = new GenericProgramming31<>();
        genericProgramming2.addObject(new Filmy("Poznavame Turecko"));
        System.out.println(genericProgramming2.getObject());

        GenericProgramming31<Knihy> genericProgramming3 = new GenericProgramming31<>();
        genericProgramming3.addObject(new Knihy("Java 8"));
        System.out.println(genericProgramming3.getObject());
    }
}
