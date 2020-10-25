package sk.jaro.generics;

import sk.jaro.objects.Pes;

import java.util.Collection;

public class GenericBox<P> {
    private P object;

    public void addObject(P object) {
        this.object = object;
    }

    public P getObject() {
        return object;
    }

    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.addObject("sfsdfs");

        String s = stringGenericBox.getObject();


        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.addObject(454);
    }
}
