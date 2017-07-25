package KavosAparatas;

/**
 * Created by Raimondas on 2017.07.14.
 */
public class KavosProduktai {
    static int cukrausKiekis;
   static int pupeliuKiekis;
   static int vandensKiekis;

   public KavosProduktai() {
    }

    public KavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = cukrausKiekis;
        this.pupeliuKiekis = pupeliuKiekis;
        this.vandensKiekis = vandensKiekis;
    }

    public KavosProduktai gausKavosProduktuKopija() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }


    public KavosProduktai setKavosProduktusVisSukuriantNaujaKavosProduktuObjekta() {
        return new KavosProduktai(cukrausKiekis, pupeliuKiekis, vandensKiekis);
    }

    public void setKavosProduktai(int cukrausKiekis, int pupeliuKiekis, int vandensKiekis) {
        this.cukrausKiekis = this.cukrausKiekis - cukrausKiekis;


    }


    public int getCukrausKiekis() {
        return cukrausKiekis;
    }

    public int getPupeliuKiekis() {
        return pupeliuKiekis;
    }

    public int getVandensKiekis() {
        return vandensKiekis;
    }

}
