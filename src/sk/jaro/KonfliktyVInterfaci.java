package sk.jaro;

public class KonfliktyVInterfaci implements AnotherInterface, DefaultMethodInteface {
    @Override
    public void zastav() {
        //
    }

    @Override
    public void pohniSa() {
        //
    }


    @Override
    public void chodSam() {
        AnotherInterface.super.chodSam();
//        DefaultMethodInteface.super.chodSam();
        System.out.println("z KonfliktyVInterfaci");
    }

    public static void main(String[] args) {
        KonfliktyVInterfaci konfliktyVInterfaci = new KonfliktyVInterfaci();
        konfliktyVInterfaci.chodSam();
    }
}
