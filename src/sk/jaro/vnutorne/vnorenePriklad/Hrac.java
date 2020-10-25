package sk.jaro.vnutorne.vnorenePriklad;

public class Hrac {
    private SkoreHraca skoreHraca;
    private int bonusHraca;

    public Hrac(int bonusHraca) {
        this.bonusHraca = bonusHraca;
    }

    public void upravSkoreHraca(){
        this.skoreHraca = new SkoreHraca(10);
    }

    class SkoreHraca{
        int skore;

        //SkoreHraca ma pristup k bonusuHraca
        SkoreHraca(int skore) {
            this.skore = skore+bonusHraca;
        }
    }

    static class StatistikaHraca{
        private int vyhry;

        public int getVyhry() {
            return vyhry;
        }

        public void setVyhry(int vyhry) {
            this.vyhry = vyhry;
        }
    }
}
