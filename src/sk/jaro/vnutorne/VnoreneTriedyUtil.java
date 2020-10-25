package sk.jaro.vnutorne;


import sk.jaro.vnutorne.rozhranie.IVypisNaKonzolu;

public class VnoreneTriedyUtil {

    void metoda(){

        //STATICKA VNORENA TRIEDA
        VnoreneTriedyUzatvarajucaTrieda.StatickaVnorenaTrieda svt = new VnoreneTriedyUzatvarajucaTrieda.StatickaVnorenaTrieda();


        //INNER VNUTORNA TRIEDA
//        UzatvarajucaTrieda.VnutornaTrieda svn = new UzatvarajucaTrieda.VnutornaTrieda(); //chyba
        VnoreneTriedyUzatvarajucaTrieda ut = new VnoreneTriedyUzatvarajucaTrieda();
        VnoreneTriedyUzatvarajucaTrieda.VnutornaTrieda vt = ut.new VnutornaTrieda();


        //anonymna trieda
        ut.metodaUzatvarajucejTriedy();
    }

    //pouzitie anonymnej triedy
    public void vypisNieco(IVypisNaKonzolu vypisNaKonzolu){
        vypisNaKonzolu.vypisNaSystemOut();
        vypisNaKonzolu.vypisNaSystemErr();
    }

}
