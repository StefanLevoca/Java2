package sk.jaro.generics;

import sk.jaro.objects.NejakyPes;
import sk.jaro.objects.NejakyPesSerialized;
import sk.jaro.objects.Pes;

import java.io.Serializable;

public class MultipleBound<P extends Pes & Serializable> {
    private P objekt;

    public P getObjekt() {
        return objekt;
    }

    public void setObjekt(P objekt) {
        this.objekt = objekt;
    }


    public static void main(String[] args) {
        MultipleBound<NejakyPesSerialized> nejakyPesSerialized = new MultipleBound<>();
        nejakyPesSerialized.setObjekt(new NejakyPesSerialized("Dunčo"));

//        MultipleBound<NejakyPes> nejakyPesMultipleBound = new MultipleBound<>(); //chyba neimplementuje Serializable

    }
}
