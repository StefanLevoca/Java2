package sk.jaro.inputOutput;

import sk.jaro.objects.Osoba;

import java.io.*;

public class ObjectStreams {
    public static void main(String[] args) {
        Osoba o = new Osoba("Jaro", "Beno",30);

        ObjectInput objectInput;
        ObjectOutput objectOutput;

        ObjectInputStream objectInputStream; //readObject
        ObjectOutputStream objectOutputStream; //writeObject


        try{

            FileOutputStream fout = new FileOutputStream("resources/object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(o);
            oos.close();
            System.out.println("Done!");

        }catch(Exception ex){
            ex.printStackTrace();
        }


        try{

            FileInputStream fin = new FileInputStream("resources/object.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Osoba osoba = (Osoba) ois.readObject();
            ois.close();

            System.out.println(osoba.getMeno());
            System.out.println(osoba.getPriezvisko());
            System.out.println(osoba.getVek());

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
