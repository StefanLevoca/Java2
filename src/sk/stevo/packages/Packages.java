package domaceUlohy.sk.stevo.packages;

import domaceUlohy.sk.stevo.zoo.zirafa.Zirafa;

public class Packages {
    public static void main(String[] args) {
        Zirafa zviera = new Zirafa();
        System.out.print("Zviera ");
        zviera.location();
        System.out.println();
        domaceUlohy.sk.stevo.afrika.zirafa.Zirafa zvieratko = new domaceUlohy.sk.stevo.afrika.zirafa.Zirafa();
        System.out.print("Zvieratko ");
        zvieratko.location();
        System.out.println();
    }
}
