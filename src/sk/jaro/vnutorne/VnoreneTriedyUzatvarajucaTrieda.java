package sk.jaro.vnutorne;


public class VnoreneTriedyUzatvarajucaTrieda {

    static int vonkajsiStaticInt = 0;
    private int vonkajsiNonStaticInt = 1;

    void setVonkajsiNonStaticInt(int vonkajsiNonStaticInt) {
        this.vonkajsiNonStaticInt = vonkajsiNonStaticInt;
    }

    interface VolajMetodu{
        void metoda();
    }


    //STATICKA VNORENA TRIEDA
    static class StatickaVnorenaTrieda{
        public void metodaStatickaVnorenaTrieda(){
//            NestedClassesUzatvarajucaTrieda nc = NestedClassesUzatvarajucaTrieda.this;  //chyba
        }
    }


    //INNER VNUTORNA TRIEDA
    class VnutornaTrieda{
        void metodaVnutornaTrieda(){
            VnoreneTriedyUzatvarajucaTrieda nc = VnoreneTriedyUzatvarajucaTrieda.this;
        }
    }


    public void metodaUzatvarajucejTriedy(){

        class Trieda2 implements VolajMetodu {
            int cislo=1;
            @Override
            public void metoda(){
                System.out.println(Trieda2.class.getName() + ".metoda");
            }
        }

        Trieda2 ta = new Trieda2();
        ta.metoda();

        //anonymná trieda
        Trieda2 tb = new Trieda2(){
            @Override
            public void metoda() {
                System.out.println(Trieda2.class.getName() + ".metoda override "+cislo);
            }
        };
        tb.metoda();

    }
}
