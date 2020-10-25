package sk.jaro.vnutorne;


import sk.jaro.vnutorne.rozhranie.IVypisNaKonzolu;
import sk.jaro.vnutorne.rozhranie.VypisNaKonzoluImpl;


public class AnonymnaTriedaUtil {

    public static void main(String[] args) {
        AnonymnaTriedaUtil util = new AnonymnaTriedaUtil();
        //nevypise nic lebo VypisNaKonzolu v sebe nema nic
        util.vypisNieco(new VypisNaKonzoluImpl());

        //toto uz je ina vec
        util.vypisNieco(new IVypisNaKonzolu(){
            @Override
            public void vypisNaSystemOut() {
                System.out.println("VypisNaKonzolu.vypisNaSystemOut");
            }

            @Override
            public void vypisNaSystemErr() {
                System.err.println("VypisNaKonzolu.vypisNaSystemErr");
            }
        });
    }

    public void vypisNieco(IVypisNaKonzolu vypisNaKonzolu){
        vypisNaKonzolu.vypisNaSystemOut();
        vypisNaKonzolu.vypisNaSystemErr();
    }

//    public void nasetujObrazovku(){
//        Obrazovka o = new Obrazovka();
//        Button b = new Button();
//        b.setBehavior(new IButton(){
//            @Override
//            public void onClick(){
//                System.out.println("klikol si na Button");
//            }
//        });
//
//        Button b2 = new Button();
//        b2.setBehavior(new IButton(){
//            @Override
//            public void onClick(){
//                System.out.println("klikol si na Button 2");
//            }
//        });
//        o.addButton(b2);
//    }
}
