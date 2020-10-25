package domaceUlohy;

//TASK 1
public class GenericProgramming1<E> {
    private E object;

    public void setObject(E object) {
        this.object = object;
    }

    public E getObject() {
        return object;
    }

    public static void main(String[] args) {
        GenericProgramming1<String> genericProgramming1 = new GenericProgramming1<>();
        genericProgramming1.setObject("TASK1");
        System.out.println(genericProgramming1.getObject());

        GenericProgramming1<Integer> genericProgramming2 = new GenericProgramming1<>();
        genericProgramming2.setObject(987654321);
        System.out.println(genericProgramming2.getObject());
    }
}
