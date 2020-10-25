package sk.jaro.generics;

public class Box {
    private Object object;

    public void addObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public static void main(String[] args) {
        Box integerBox = new Box();
        integerBox.addObject("2");

        Integer integer = (Integer) integerBox.getObject(); //java.lang.ClassCastException
        System.out.println(integer);

    }
}
