package sk.jaro.generics;

import sk.jaro.objects.NejakyPes;
import sk.jaro.objects.Osoba;
import sk.jaro.objects.Pes;

public class BoundedType <P extends Pes> {
    private P objectPsa;

    public P getObjectPsa() {
        return objectPsa;
    }

    public void setObjectPsa(P objectPsa) {
        this.objectPsa = objectPsa;
    }

    public void stekaj(){
        objectPsa.stekaj();
    }

    public static void main(String[] args) {
//        BoundedType<Pes> pes = new BoundedType<>();
        BoundedType<NejakyPes> pesBoundedType = new BoundedType<>();
        pesBoundedType.setObjectPsa(new NejakyPes());

        pesBoundedType.stekaj();
    }
}
