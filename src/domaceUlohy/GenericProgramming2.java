package domaceUlohy;

//TASK 2
public class GenericProgramming2<E, V> {
    private E object1;
    private V object2;

    public void setObjects(E object1, V object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    public E getObject1() {
        return object1;
    }

    public V getObject2() {
        return object2;
    }

    public static void main(String[] args) {
        GenericProgramming2<String, Integer> genericProgramming1 = new GenericProgramming2<>();
        genericProgramming1.setObjects("TASK2", 987654321);
        System.out.println(genericProgramming1.getObject1());
        System.out.println(genericProgramming1.getObject2());
    }
}
